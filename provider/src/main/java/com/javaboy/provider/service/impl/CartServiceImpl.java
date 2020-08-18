package com.javaboy.provider.service.impl;

import com.javaboy.provider.dao.CartDao;
import com.javaboy.provider.entity.Cart;
import com.javaboy.provider.service.CartService;
import com.javaboy.provider.vo.CartGood;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Cart)表服务实现类
 *
 * @author haijian.li
 * @since 2020-08-05 11:06:37
 */
@Service("cartService")
public class CartServiceImpl implements CartService {
    @Resource
    private CartDao cartDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    @Override
    public Cart queryById(Integer cid) {
        return this.cartDao.queryById(cid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Cart> queryAllByLimit(int offset, int limit) {
        return this.cartDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param cart 实例对象
     * @return 实例对象
     */
    @Override
    public Cart insert(Cart cart) {
        this.cartDao.insert(cart);
        return cart;
    }

    /**
     * 修改数据
     *
     * @param cart 实例对象
     * @return 实例对象
     */
    @Override
    public Cart update(Cart cart) {
        this.cartDao.update(cart);
        return this.queryById(cart.getCid());
    }

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer cid) {
        return this.cartDao.deleteById(cid) > 0;
    }

    @Override
    public List<CartGood> getCartsByUid(Integer uid) {
        return cartDao.getCartsByUid(uid);
    }
}