package com.javaboy.provider.dao;

import com.javaboy.provider.entity.Good;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Good)表数据库访问层
 *
 * @author haijian.li
 * @since 2020-08-05 11:10:05
 */
public interface GoodDao {

    /**
     * 通过ID查询单条数据
     *
     * @param gid 主键
     * @return 实例对象
     */
    Good queryById(Integer gid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Good> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param good 实例对象
     * @return 对象列表
     */
    List<Good> queryAll(Good good);

    /**
     * 新增数据
     *
     * @param good 实例对象
     * @return 影响行数
     */
    int insert(Good good);

    /**
     * 修改数据
     *
     * @param good 实例对象
     * @return 影响行数
     */
    int update(Good good);

    /**
     * 通过主键删除数据
     *
     * @param gid 主键
     * @return 影响行数
     */
    int deleteById(Integer gid);

}