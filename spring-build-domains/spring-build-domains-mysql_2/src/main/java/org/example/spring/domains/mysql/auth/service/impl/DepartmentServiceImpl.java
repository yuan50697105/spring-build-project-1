package org.example.spring.domains.mysql.auth.service.impl;

import lombok.AllArgsConstructor;
import org.example.spring.domains.mysql.auth.service.DepartmentService;
import org.example.spring.models.mysql.auth.entity.query.DepartmentQuery;
import org.example.spring.models.mysql.auth.entity.result.Department;
import org.example.spring.models.mysql.auth.entity.result.DepartmentDetails;
import org.example.spring.models.mysql.auth.entity.vo.DepartmentModelVo;
import org.example.spring.models.mysql.auth.repository.DepartmentRepository;
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
    public void save(DepartmentModelVo formVo) {
        departmentRepository.save(formVo);
    }

    @Override
    public void update(DepartmentModelVo formVo) {
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

    @Override
    public DepartmentDetails get(Long id) {
        return departmentRepository.getDetailsById(id);
    }
}