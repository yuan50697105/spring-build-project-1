package org.example.spring.plugins.mybatis.repository;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;
import org.example.spring.plugins.mybatis.entity.query.IBaseQuery;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface IBaseRepository<T extends IBaseEntity, DTO extends T, VO extends T, Q extends IBaseQuery> {

    void save(VO vo);

    void update(VO vo);

    void updateNull(VO vo);

    void update(VO vo, Q q);

    void updateNull(VO vo, Q q);

    void delete(Long id);

    void delete(Long... ids);

    void delete(List<Long> ids);

    void remove(Long id);

    void remove(Long... ids);

    void remove(List<Long> ids);

    DTO get(Long id);

    DTO queryOne(Q q);

    Optional<DTO> queryOneOpt(Q q);

    DTO queryFirst(Q q);

    Optional<DTO> queryFirstOpt(Q q);

    List<DTO> queryList(Q q);

    Stream<DTO> queryStream(Q q);

    List<DTO> queryTop(Q q);

    Stream<DTO> queryTopStream(Q q);

    IPageData<DTO> queryPage(Q q);

    DTO selectOne(Q q);

    Optional<DTO> selectOneOpt(Q q);

    DTO selectFirst(Q q);

    Optional<DTO> selectFirstOpt(Q q);

    List<DTO> selectList(Q q);

    Stream<DTO> selectStream(Q q);

    List<DTO> selectTop(Q q);

    Stream<DTO> selectTopStream(Q q);

    IPageData<DTO> selectPage(Q q);
}
