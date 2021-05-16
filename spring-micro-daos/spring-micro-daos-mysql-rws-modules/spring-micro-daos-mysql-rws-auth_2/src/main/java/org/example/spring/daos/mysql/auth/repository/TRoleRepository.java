package org.example.spring.daos.mysql.auth.repository;

import org.example.spring.daos.mysql.auth.table.dto.TRoleDTO;
import org.example.spring.daos.mysql.auth.table.query.TRoleQuery;
import org.example.spring.daos.mysql.auth.table.vo.TRoleVo;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface TRoleRepository {
    void save(TRoleVo vo);

    void update(TRoleVo vo);

    void delete(Long id);

    void delete(Long... ids);

    void delete(List<Long> ids);

    TRoleDTO get(Long id);

    Optional<TRoleDTO> getOpt(Long id);

    TRoleDTO queryOne(TRoleQuery query);

    TRoleDTO selectOne(TRoleQuery query);

    Optional<TRoleDTO> selectOneOpt(TRoleQuery query);

    Optional<TRoleDTO> queryOneOpt(TRoleQuery query);

    TRoleDTO queryFirst(TRoleQuery query);

    Optional<TRoleDTO> queryFirstOpt(TRoleQuery query);

    TRoleDTO selectFirst(TRoleQuery query);

    Optional<TRoleDTO> selectFirstOpt(TRoleQuery query);

    List<TRoleDTO> queryList(TRoleQuery query);

    List<TRoleDTO> selectList(TRoleQuery query);

    Stream<TRoleDTO> queryStream(TRoleQuery query);

    Stream<TRoleDTO> selectStream(TRoleQuery query);

    List<TRoleDTO> queryTop(TRoleQuery query);

    Stream<TRoleDTO> queryTopStream(TRoleQuery query);

    List<TRoleDTO> selectTop(TRoleQuery query);

    Stream<TRoleDTO> selectTopStream(TRoleQuery query);

    IPageData<TRoleDTO> selectPage(TRoleQuery query);

    IPageData<TRoleDTO> queryPage(TRoleQuery query);
}

