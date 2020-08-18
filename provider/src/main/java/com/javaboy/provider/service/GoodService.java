package com.javaboy.provider.service;

import com.javaboy.provider.entity.Good;

import java.util.List;

/**
 * (Good)表服务接口
 *
 * @author haijian.li
 * @since 2020-08-05 11:10:05
 */
public interface GoodService {

    /**
     * 通过ID查询单条数据
     *
     * @param gid 主键
     * @return 实例对象
     */
    Good queryById(Integer gid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Good> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param good 实例对象
     * @return 实例对象
     */
    Good insert(Good good);

    /**
     * 修改数据
     *
     * @param good 实例对象
     * @return 实例对象
     */
    Good update(Good good);

    /**
     * 通过主键删除数据
     *
     * @param gid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer gid);

}