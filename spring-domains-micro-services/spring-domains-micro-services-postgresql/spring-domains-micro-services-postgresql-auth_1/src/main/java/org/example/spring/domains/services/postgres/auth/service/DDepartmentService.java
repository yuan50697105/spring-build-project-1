package org.example.spring.domains.services.postgres.auth.service;

import org.example.spring.repositories.postgres.auth.table.dto.TDepartmentDTO;
import org.example.spring.repositories.postgres.auth.table.query.TDepartmentQuery;
import org.example.spring.repositories.postgres.auth.table.vo.TDepartmentVo;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;

public interface DDepartmentService {

    void save(TDepartmentVo vo);

    void update(TDepartmentVo vo);

    void delete(List<Long> ids);

    IPageData<TDepartmentDTO> selectPage(TDepartmentQuery query);

    List<TDepartmentDTO> selectList(TDepartmentQuery query);

    TDepartmentDTO selectOne(TDepartmentQuery query);

    TDepartmentDTO get(Long id);
}
