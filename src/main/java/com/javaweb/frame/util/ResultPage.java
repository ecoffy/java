package com.javaweb.frame.util;

import java.util.List;

/**
 * name: RuoFei Xu
 * 2020/8/31 14:24
 */
public class ResultPage<T> {
    //总记录数
    private long total;
    //记录数据 封装   在list中
    private List<T> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "ResultPage{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
