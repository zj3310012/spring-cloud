package com.yt.dataExchange.utils;

import java.util.List;

public class Page<T> {

	//当前页
	private int currentPage;
	//每页的数量
	private int size;
	//总记录数
    private long count;
    //总页数
    private int totalPages;
    //结果集
    private List<T> list;
    public Page(int currentPage, int size) {
        this.currentPage = currentPage;
        this.size = size;
    }

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

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

}
