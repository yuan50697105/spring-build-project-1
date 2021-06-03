package org.example.spring.domains.services.mysql.auth.service;


import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.auth.vo.DepartmentVo;

import java.util.List;

public interface DDepartmentService {

    void save(DepartmentVo vo);

    void update(DepartmentVo vo);

    void delete(List<Long> ids);

    IPageData<DepartmentDTO> selectPage(DepartmentQuery query);

    List<DepartmentDTO> selectList(DepartmentQuery query);

    DepartmentDTO selectOne(DepartmentQuery query);

    DepartmentDTO get(Long id);
}
