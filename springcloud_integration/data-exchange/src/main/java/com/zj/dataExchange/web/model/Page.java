package com.zj.dataExchange.web.model;

import java.io.Serializable;

/**
 * 
 * @author zhangjing
 * date: 2019年2月22日 下午2:22:15
 */
public class Page implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8895471982068081121L;
	
	private int currentPage;
	
	private int size;
	
	private String orderBy;
	
	private String orderWay;

	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public String getOrderWay() {
		return orderWay;
	}
	public void setOrderWay(String orderWay) {
		this.orderWay = orderWay;
	}
	
}
