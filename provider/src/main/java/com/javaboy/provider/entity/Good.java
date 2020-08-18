package com.javaboy.provider.entity;

import java.io.Serializable;

/**
 * (Good)实体类
 *
 * @author $ haijian.li
 * @since 2020-08-05 11:10:04
 */
public class Good implements Serializable {
    private static final long serialVersionUID = 957504235702236802L;

    private Integer gid;

    private String gname;

    private Double gprice;


    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Double getGprice() {
        return gprice;
    }

    public void setGprice(Double gprice) {
        this.gprice = gprice;
    }

}