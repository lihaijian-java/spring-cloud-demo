package com.javaboy.provider.dao;

import com.javaboy.provider.entity.Cart;
import com.javaboy.provider.vo.CartGood;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Cart)表数据库访问层
 *
 * @author haijian.li
 * @since 2020-08-05 11:06:37
 */
public interface CartDao {

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    Cart queryById(Integer cid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Cart> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param cart 实例对象
     * @return 对象列表
     */
    List<Cart> queryAll(Cart cart);

    /**
     * 新增数据
     *
     * @param cart 实例对象
     * @return 影响行数
     */
    int insert(Cart cart);

    /**
     * 修改数据
     *
     * @param cart 实例对象
     * @return 影响行数
     */
    int update(Cart cart);

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 影响行数
     */
    int deleteById(Integer cid);

    List<CartGood> getCartsByUid(Integer uid);
}