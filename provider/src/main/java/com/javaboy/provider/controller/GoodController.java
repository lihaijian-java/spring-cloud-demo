package com.javaboy.provider.controller;

import com.javaboy.provider.entity.Good;
import com.javaboy.provider.service.GoodService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Good)表控制层
 *
 * @author haijian.li
 * @since 2020-08-05 11:10:05
 */
@RestController
@RequestMapping("good")
public class GoodController {
    /**
     * 服务对象
     */
    @Resource
    private GoodService goodService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Good selectOne(Integer id) {
        return this.goodService.queryById(id);
    }

}