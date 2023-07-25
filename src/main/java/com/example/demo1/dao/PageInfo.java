package com.example.demo1.dao;

import java.util.List;

public class PageInfo<T> {
    //当前页
    private int pageCurrent;
    //页行数
    private int pageSize;
    //总条数
    private int sumCounts;
    //总页数
    private int sumPages;
    //数据结果集
    private List<T> DataList;

    public int getPageCurrent() {
        return pageCurrent;
    }

    public void setPageCurrent(int pageCurrent) {
        this.pageCurrent = pageCurrent;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getSumCounts() {
        return sumCounts;
    }

    public void setSumCounts(int sumCounts) {
        this.sumCounts = sumCounts;
    }

    public int getSumPages() {
        return sumPages;
    }

    public void setSumPages(int sumPages) {
        this.sumPages = sumPages;
    }

    public List<T> getDataList() {
        return DataList;
    }

    public void setDataList(List<T> dataList) {
        DataList = dataList;
    }
}
