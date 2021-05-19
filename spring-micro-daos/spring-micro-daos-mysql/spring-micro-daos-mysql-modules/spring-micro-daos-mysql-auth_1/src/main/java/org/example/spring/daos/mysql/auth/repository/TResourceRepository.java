package org.example.spring.daos.mysql.auth.repository;

import org.example.spring.daos.mysql.auth.table.dto.TResourceDTO;
import org.example.spring.daos.mysql.auth.table.query.TResourceQuery;
import org.example.spring.daos.mysql.auth.table.vo.TResourceVo;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface TResourceRepository {
    void save(TResourceVo vo);

    void update(TResourceVo vo);

    void delete(Long id);

    void delete(Long... ids);

    void delete(List<Long> ids);

    TResourceDTO get(Long id);

    Optional<TResourceDTO> getOpt(Long id);

    TResourceDTO queryOne(TResourceQuery query);

    TResourceDTO selectOne(TResourceQuery query);

    Optional<TResourceDTO> selectOneOpt(TResourceQuery query);

    Optional<TResourceDTO> queryOneOpt(TResourceQuery query);

    TResourceDTO queryFirst(TResourceQuery query);

    Optional<TResourceDTO> queryFirstOpt(TResourceQuery query);

    TResourceDTO selectFirst(TResourceQuery query);

    Optional<TResourceDTO> selectFirstOpt(TResourceQuery query);

    List<TResourceDTO> queryList(TResourceQuery query);

    List<TResourceDTO> selectList(TResourceQuery query);

    Stream<TResourceDTO> queryStream(TResourceQuery query);

    Stream<TResourceDTO> selectStream(TResourceQuery query);

    List<TResourceDTO> queryTop(TResourceQuery query);

    Stream<TResourceDTO> queryTopStream(TResourceQuery query);

    List<TResourceDTO> selectTop(TResourceQuery query);

    Stream<TResourceDTO> selectTopStream(TResourceQuery query);

    IPageData<TResourceDTO> selectPage(TResourceQuery query);

    IPageData<TResourceDTO> queryPage(TResourceQuery query);
}

