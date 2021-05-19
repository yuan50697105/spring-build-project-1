package org.example.spring.daos.mysql.auth.repository;

import org.example.spring.daos.mysql.auth.table.dto.TDepartmentDTO;
import org.example.spring.daos.mysql.auth.table.query.TDepartmentQuery;
import org.example.spring.daos.mysql.auth.table.vo.TDepartmentVo;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface TDepartmentRepository {
    void save(TDepartmentVo vo);

    void update(TDepartmentVo vo);

    void delete(Long id);

    void delete(Long... ids);

    void delete(List<Long> ids);

    TDepartmentDTO get(Long id);

    Optional<TDepartmentDTO> getOpt(Long id);

    TDepartmentDTO queryOne(TDepartmentQuery query);

    TDepartmentDTO selectOne(TDepartmentQuery query);

    Optional<TDepartmentDTO> selectOneOpt(TDepartmentQuery query);

    Optional<TDepartmentDTO> queryOneOpt(TDepartmentQuery query);

    TDepartmentDTO queryFirst(TDepartmentQuery query);

    Optional<TDepartmentDTO> queryFirstOpt(TDepartmentQuery query);

    TDepartmentDTO selectFirst(TDepartmentQuery query);

    Optional<TDepartmentDTO> selectFirstOpt(TDepartmentQuery query);

    List<TDepartmentDTO> queryList(TDepartmentQuery query);

    List<TDepartmentDTO> selectList(TDepartmentQuery query);

    Stream<TDepartmentDTO> queryStream(TDepartmentQuery query);

    Stream<TDepartmentDTO> selectStream(TDepartmentQuery query);

    List<TDepartmentDTO> queryTop(TDepartmentQuery query);

    List<TDepartmentDTO> selectTop(TDepartmentQuery query);

    Stream<TDepartmentDTO> queryTopStream(TDepartmentQuery query);

    Stream<TDepartmentDTO> selectTopStream(TDepartmentQuery query);

    IPageData<TDepartmentDTO> selectPage(TDepartmentQuery query);

    IPageData<TDepartmentDTO> queryPage(TDepartmentQuery query);

    boolean validateDelete(List<Long> ids);
}

