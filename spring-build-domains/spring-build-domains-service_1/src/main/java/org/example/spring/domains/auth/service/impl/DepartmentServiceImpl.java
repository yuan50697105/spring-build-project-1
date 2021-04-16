package org.example.spring.domains.auth.service.impl;

import lombok.AllArgsConstructor;
import org.example.spring.domains.auth.service.DepartmentService;
import org.example.spring.models.auth.entity.query.DepartmentQuery;
import org.example.spring.models.auth.entity.result.Department;
import org.example.spring.models.auth.entity.vo.DepartmentFormVo;
import org.example.spring.models.auth.repository.DepartmentRepository;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Override
    public void save(DepartmentFormVo formVo) {
        departmentRepository.save(formVo);
    }

    @Override
    public void update(DepartmentFormVo formVo) {
        departmentRepository.update(formVo);
    }

    @Override
    public void delete(List<Long> ids) {
        departmentRepository.delete(ids);
    }

    @Override
    public IPageData<Department> selectPage(DepartmentQuery query) {
        return departmentRepository.queryPage(query);
    }

    @Override
    public List<Department> selectList(DepartmentQuery query) {
        return departmentRepository.queryTop(query, query.getSize());
    }

    @Override
    public Department selectOne(DepartmentQuery query) {
        return departmentRepository.queryFirst(query);
    }
}