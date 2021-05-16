package org.example.spring.plugins.mybatis.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.mybatis.entity.query.EBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author yuane
 */
public interface EBaseDao<T, Q extends EBaseQuery<E>, E> extends IService<T> {
    Optional<T> getByIdOpt(Long id);

    List<T> queryList(Q query);

    List<T> selectList(Q query);

    Stream<T> queryListStream(Q query);

    Stream<T> selectListStream(Q query);

    Stream<T> queryTopStream(Q query);

    IPageData<T> queryPage(Q query);

    IPageData<T> selectPage(Q query);

    List<T> queryTop(Q query);

    List<T> selectTop(Q query);

    Optional<T> queryFirstOpt(Q query);

    T queryFirst(Q query);

    T queryOne(Q query);

    Optional<T> queryOneOpt(Q query);

    Optional<T> selectOneOpt(Q query);

    boolean update(T t);

    boolean updateSelective(T t);

    boolean updateNotNullColumnsBatchById(List<T> listForUpdate);

    boolean updateSetColumnsBatchById(List<T> list);

    boolean insertNotNullColumnsBatch(List<T> list);

    boolean insertSelective(T t);

    boolean insert(T t);

    boolean remove(Q q);

    boolean update(T t, Q q);

    boolean updateSelective(T t, Q q);

    boolean insertSetColumnsBatch(List<T> list);

    boolean remove(Example example);

    boolean delete(Example example);

    boolean removeByIds(Serializable... ids);

    boolean deleteByMap(Map<String, Object> map);

    boolean delete(Q q);

    boolean deleteById(Serializable id);

    boolean deleteByIds(Collection<? extends Serializable> ids);

    boolean deleteByIds(Serializable... ids);
}
