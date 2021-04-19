package org.example.spring.plugins.mybatis.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.mybatis.entity.query.EBaseQuery;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

/**
 * @author yuane
 */
public interface EBaseDao<T, Q extends EBaseQuery<E>, E> extends IService<T> {
    Optional<T> getByIdOpt(Long id);

    CompletableFuture<Optional<T>> getByIdOptAsync(Long id);

    List<T> queryList(Q query);

    IPageData<T> queryPage(Q query);

    List<T> queryTop(Q query, Integer size);

    Optional<T> queryFirst(Q query);

    T queryOne(Q query);

    Optional<T> queryOneOpt(Q query);

    boolean updateAllById(T t);

    boolean updateSelectiveById(T t);

    boolean updateNotNullColumnsBatchById(List<T> listForUpdate);

    boolean updateSetColumnsBatchById(List<T> list);

    boolean insertNotNullColumnsBatch(List<T> list);

    boolean insertSelective(T t);

    boolean insert(T t);

    boolean remove(Q q);

    boolean updateAll(T t, Q q);

    boolean updateSelective(T t, Q q);

    boolean insertSetColumnsBatch(List<T> list);
}
