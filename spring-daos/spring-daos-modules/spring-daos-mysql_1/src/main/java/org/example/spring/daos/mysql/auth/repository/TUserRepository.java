package org.example.spring.daos.mysql.auth.repository;

import org.example.spring.daos.mysql.auth.table.dto.TUserDTO;
import org.example.spring.daos.mysql.auth.table.query.TUserQuery;
import org.example.spring.daos.mysql.auth.table.vo.TUserVo;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface TUserRepository {
    void save(TUserVo vo);

    void update(TUserVo vo);

    void delete(Long id);

    void delete(Long... ids);

    void delete(List<Long> ids);

    TUserDTO get(Long id);

    Optional<TUserDTO> getOpt(Long id);

    TUserDTO queryOne(TUserQuery query);

    TUserDTO selectOne(TUserQuery query);

    Optional<TUserDTO> selectOneOpt(TUserQuery query);

    Optional<TUserDTO> queryOneOpt(TUserQuery query);

    TUserDTO queryFirst(TUserQuery query);

    Optional<TUserDTO> queryFirstOpt(TUserQuery query);

    TUserDTO selectFirst(TUserQuery query);

    Optional<TUserDTO> selectFirstOpt(TUserQuery query);

    List<TUserDTO> queryList(TUserQuery query);

    List<TUserDTO> selectList(TUserQuery query);

    Stream<TUserDTO> queryStream(TUserQuery query);

    Stream<TUserDTO> selectStream(TUserQuery query);

    List<TUserDTO> queryTop(TUserQuery query);

    Stream<TUserDTO> queryTopStream(TUserQuery query);

    List<TUserDTO> selectTop(TUserQuery query);

    Stream<TUserDTO> selectTopStream(TUserQuery query);

    IPageData<TUserDTO> selectPage(TUserQuery query);

    IPageData<TUserDTO> queryPage(TUserQuery query);
}

