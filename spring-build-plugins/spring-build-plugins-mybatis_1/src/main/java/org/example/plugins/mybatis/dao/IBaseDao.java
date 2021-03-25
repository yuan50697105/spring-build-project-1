package org.example.plugins.mybatis.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import org.example.plugins.mybatis.entity.IPageData;
import org.example.plugins.mybatis.entity.query.IBaseQuery;

import java.util.List;
import java.util.Optional;

/**
 * @author yuane
 */
public interface IBaseDao<T, Q extends IBaseQuery<E>, E> extends IService<T> {
    Optional<T> getByIdOpt(Long id);

    List<T> queryList(Q query);

    IPageData<T> queryPage(Q query);

    List<T> queryTop(Q query, Integer size);

    Optional<T> queryFirst(Q query);

    T queryOne(Q query);

    Optional<T> queryOneOpt(Q query);
}
