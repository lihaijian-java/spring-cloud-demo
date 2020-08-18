package com.javaboy.provider.service;

import com.javaboy.provider.entity.Cart;
import com.javaboy.provider.vo.CartGood;

import java.util.List;

/**
 * (Cart)表服务接口
 *
 * @author haijian.li
 * @since 2020-08-05 11:06:37
 */
public interface CartService {

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    Cart queryById(Integer cid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Cart> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param cart 实例对象
     * @return 实例对象
     */
    Cart insert(Cart cart);

    /**
     * 修改数据
     *
     * @param cart 实例对象
     * @return 实例对象
     */
    Cart update(Cart cart);

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer cid);

    /**
     * 获取用户购物车内商品
     * @param uid
     * @return
     */
    List<CartGood> getCartsByUid(Integer uid);
}