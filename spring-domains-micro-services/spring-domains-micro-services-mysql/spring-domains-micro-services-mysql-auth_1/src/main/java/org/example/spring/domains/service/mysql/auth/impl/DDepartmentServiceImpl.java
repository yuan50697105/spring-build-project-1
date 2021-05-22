package org.example.spring.domains.service.mysql.auth.impl;


import lombok.AllArgsConstructor;
import org.example.spring.domains.service.mysql.auth.DDepartmentService;
import org.example.spring.models.mysql.auth.entity.query.DDepartmentQuery;
import org.example.spring.models.mysql.auth.entity.result.DDepartmentDTO;
import org.example.spring.models.mysql.auth.entity.vo.DDepartmentVo;
import org.example.spring.models.mysql.auth.repository.DDepartmentRepository;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class DDepartmentServiceImpl implements DDepartmentService {
    private final DDepartmentRepository departmentRepository;

    @Override
    public void save(DDepartmentVo formVo) {
    }

    @Override
    public void update(DDepartmentVo formVo) {

    }

    @Override
    public void delete(List<Long> ids) {

    }

    @Override
    public IPageData<DDepartmentDTO> selectPage(DDepartmentQuery query) {
        return null;
    }

    @Override
    public List<DDepartmentDTO> selectList(DDepartmentQuery query) {
        return null;
    }

    @Override
    public DDepartmentDTO selectOne(DDepartmentQuery query) {
        return null;
    }

    @Override
    public DDepartmentDTO get(Long id) {
        return null;
    }
}