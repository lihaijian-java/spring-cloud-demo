package com.javaboy.provider.entity;

import java.io.Serializable;

/**
 * (Cart)实体类
 *
 * @author $ haijian.li
 * @since 2020-08-05 11:06:37
 */
public class Cart implements Serializable {
    private static final long serialVersionUID = -53168797869399759L;

    private Integer cid;

    private Integer uid;

    private Double tprice;


    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getTprice() {
        return tprice;
    }

    public void setTprice(Double tprice) {
        this.tprice = tprice;
    }

}