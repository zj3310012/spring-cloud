package com.zj.dataExchange.web.controller;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.util.concurrent.RateLimiter;
import com.zj.dataExchange.enums.ResponseStatus;
import com.zj.dataExchange.service.user.UserService;
import com.zj.dataExchange.utils.ReturnData;
import com.zj.dataExchange.web.model.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
@Api(tags = "用户操作")
public class UserController implements InitializingBean {

	@Autowired
	private UserService userService;

	@Value("${user.rateLimiter}")
	private int rateLimiterCount;

	private RateLimiter rateLimiter;

	@ApiOperation(value = "查询用户信息", notes = "根据条件获取用户列表")
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public ReturnData getUserByCondition(@RequestBody User user) {
		//限流操作
		if (rateLimiter.tryAcquire(1)) {
			return userService.queryUserListByCondition(user);
		} else {
			return new ReturnData(ResponseStatus.RATE_LIMITER_ERROR.getCode(), "",
					ResponseStatus.RATE_LIMITER_ERROR.getMsg());
		}
	}

	@ApiImplicitParam(name = "username", value = "用户名", paramType = "query", dataType = "string")
	@ApiOperation(value = "查询用户详情", notes = "根据用户名获取用户详情")
	@RequestMapping(value = "/detail/username", method = RequestMethod.GET)
	@ResponseBody
	public ReturnData getUserByName(@RequestParam("username") String username) {
		return userService.queryUserByUsername(username);
	}

	@ApiImplicitParam(name = "id", value = "用户id", paramType = "query", dataType = "string")
	@ApiOperation(value = "查询用户详情", notes = "根据id获取用户详情")
	@RequestMapping(value = "/detail/id", method = RequestMethod.GET)
	@ResponseBody
	public ReturnData getUserById(@RequestParam("id") String id) {
		return userService.queryUserById(id);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		rateLimiter = RateLimiter.create(this.rateLimiterCount);
	}
}
