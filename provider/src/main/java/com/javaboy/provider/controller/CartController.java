package com.javaboy.provider.controller;

import com.javaboy.provider.entity.Cart;
import com.javaboy.provider.service.CartService;
import com.javaboy.provider.vo.CartGood;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Cart)表控制层
 *
 * @author haijian.li
 * @since 2020-08-05 11:06:38
 */
@RestController
@RequestMapping("cart")
public class CartController {
    /**
     * 服务对象
     */
    @Resource
    private CartService cartService;

    /**
     * 查询用户购物车
     *
     * @param id 用户id
     * @return 单条数据
     */
   @GetMapping("selectCart")
    public List<CartGood> getCardGoodByUser(@RequestParam Integer uid){
       return cartService.getCartsByUid(uid);
   }

}