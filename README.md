# springcloud
springcloud内部项目实战，简单上手！

项目主要框架为：springboot、springcloud、mybatis</br>
项目功能模块：</br>
1.register_center:eureka注册中心.</br>
2.api-gateway:api网管.主要功能：1.用户权限校验；2.AES对称加解密；3.DSA非对称签名校验；4.路由转发之前对httprequest数据内容进行转换</br>
3.data-exchange:数据交换.主要功能：1.提供zipkin服务追踪功能；2.基于fegin的声明式调用底层接口；3.对接口调用超时提供基于hystrix熔断和服务降级功能；4.
                提供swagger2web调试</br>
4.uni-platform:统一接口api.主要功能：1.提供zipkin服务追踪功能；2.提供底层统一接口调用</br>
5.zipkin-server:zipkin追踪服务web.主要功能：1.将追踪链数据存储到mysql；2.提供zipkin管理页面查看项目调用链中各阶段执行时间延迟</br>
6.sidecar:python代理</br>

简单示意图：</br>
![image](https://github.com/zj3310012/springcloud/blob/master/images/springcloud_proces.png)
