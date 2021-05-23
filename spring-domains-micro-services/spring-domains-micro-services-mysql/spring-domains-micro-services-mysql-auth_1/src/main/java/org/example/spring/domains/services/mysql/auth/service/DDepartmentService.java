package org.example.spring.domains.services.mysql.auth.service;

import org.example.spring.daos.mysql.auth.table.dto.TDepartmentDTO;
import org.example.spring.daos.mysql.auth.table.query.TDepartmentQuery;
import org.example.spring.daos.mysql.auth.table.vo.TDepartmentVo;
import org.example.spring.domains.repositories.mysql.auth.entity.query.DDepartmentQuery;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;

public interface DDepartmentService {

    void save(TDepartmentVo formVo);

    void update(TDepartmentVo formVo);

    void delete(List<Long> ids);

    IPageData<TDepartmentDTO> selectPage(TDepartmentQuery query);

    List<TDepartmentDTO> selectList(DDepartmentQuery query);

    TDepartmentDTO selectOne(DDepartmentQuery query);

    TDepartmentDTO get(Long id);
}
