package org.example.spring.domains.services.mysql.auth.service.impl;


import lombok.AllArgsConstructor;
import org.example.spring.domains.services.mysql.auth.service.DDepartmentService;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.auth.api.DepartmentRepository;
import org.example.spring.repositories.commons.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.auth.vo.DepartmentVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class DDepartmentServiceImpl implements DDepartmentService {
    private final DepartmentRepository departmentRepository;

    @Override
    public void save(DepartmentVo vo) {
        departmentRepository.save(vo);
    }

    @Override
    public void update(DepartmentVo vo) {
        departmentRepository.update(vo);
    }

    @Override
    public void delete(List<Long> ids) {
        departmentRepository.delete(ids);
    }

    @Override
    public IPageData<DepartmentDTO> selectPage(DepartmentQuery query) {
        return departmentRepository.data(query);
    }

    @Override
    public List<DepartmentDTO> selectList(DepartmentQuery query) {
        return departmentRepository.top(query);
    }

    @Override
    public DepartmentDTO selectOne(DepartmentQuery query) {
        return departmentRepository.first(query);
    }

    @Override
    public DepartmentDTO get(Long id) {
        return departmentRepository.get(id);
    }
}