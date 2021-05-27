package org.example.spring.plugins.mybatis.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.mybatis.entity.query.IBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public interface IBaseDao<T, Q extends IBaseQuery> extends IService<T> {
    Optional<T> getByIdOpt(Long id);

    List<T> queryList(Q query);

    List<T> selectList(Q query);

    List<T> searchList(Q query);

    Stream<T> queryListStream(Q query);

    Stream<T> selectListStream(Q query);

    Stream<T> searchListStream(Q query);

    Stream<T> queryTopStream(Q query);

    Stream<T> selectTopStream(Q query);

    Stream<T> searchTopStream(Q query);

    IPageData<T> queryPage(Q query);

    IPageData<T> selectPage(Q query);

    IPageData<T> searchPage(Q query);

    List<T> queryTop(Q query);

    List<T> selectTop(Q query);

    List<T> searchTop(Q query);

    Optional<T> queryFirstOpt(Q query);

    Optional<T> selectFirstOpt(Q query);

    Optional<T> searchFirstOpt(Q query);

    T queryFirst(Q query);

    T selectFirst(Q query);

    T searchFirst(Q query);

    T queryOne(Q query);

    T selectOne(Q query);

    T searchOne(Q query);

    Optional<T> queryOneOpt(Q query);

    Optional<T> selectOneOpt(Q query);

    Optional<T> searchOneOpt(Q query);

    boolean modifyById(T t);

    @Deprecated
    boolean update(T t);

    @Deprecated
    boolean modify(T t);

    boolean updateNull(T t);

    boolean modifyNull(T t);

    boolean updateSelective(T t);

    boolean modifySelective(T t);

    boolean updateNotNullColumnsBatchById(List<T> listForUpdate);

    boolean modifyNotNullColumnsBatchById(List<T> listForUpdate);

    boolean updateSetColumnsBatchById(List<T> list);

    boolean modifySetColumnsBatchById(List<T> list);

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
