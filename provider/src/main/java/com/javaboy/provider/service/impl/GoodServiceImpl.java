package com.javaboy.provider.service.impl;

import com.javaboy.provider.dao.GoodDao;
import com.javaboy.provider.entity.Good;
import com.javaboy.provider.service.GoodService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Good)表服务实现类
 *
 * @author haijian.li
 * @since 2020-08-05 11:10:05
 */
@Service("goodService")
public class GoodServiceImpl implements GoodService {
    @Resource
    private GoodDao goodDao;

    /**
     * 通过ID查询单条数据
     *
     * @param gid 主键
     * @return 实例对象
     */
    @Override
    public Good queryById(Integer gid) {
        return this.goodDao.queryById(gid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Good> queryAllByLimit(int offset, int limit) {
        return this.goodDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param good 实例对象
     * @return 实例对象
     */
    @Override
    public Good insert(Good good) {
        this.goodDao.insert(good);
        return good;
    }

    /**
     * 修改数据
     *
     * @param good 实例对象
     * @return 实例对象
     */
    @Override
    public Good update(Good good) {
        this.goodDao.update(good);
        return this.queryById(good.getGid());
    }

    /**
     * 通过主键删除数据
     *
     * @param gid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer gid) {
        return this.goodDao.deleteById(gid) > 0;
    }
}