package com.javaboy.provider.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 购物车内商品数量、单价、名称
 */
@Data
public class CartGood implements Serializable {
    private static final long serialVersionUID = 101L;
    private String gname;
    private double gprice;
    private Integer quanity;
}
