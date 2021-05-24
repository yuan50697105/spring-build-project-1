package org.example.spring.domains.services.mysql.auth.service.impl;


import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.auth.table.dto.TDepartmentDTO;
import org.example.spring.daos.mysql.auth.table.query.TDepartmentQuery;
import org.example.spring.daos.mysql.auth.table.vo.TDepartmentVo;
import org.example.spring.domains.repositories.mysql.auth.repository.DDepartmentRepository;
import org.example.spring.domains.services.mysql.auth.service.DDepartmentService;
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
    public void save(TDepartmentVo vo) {
        departmentRepository.save(vo);
    }

    @Override
    public void update(TDepartmentVo vo) {
        departmentRepository.update(vo);
    }

    @Override
    public void delete(List<Long> ids) {
        departmentRepository.delete(ids);
    }

    @Override
    public IPageData<TDepartmentDTO> selectPage(TDepartmentQuery query) {
        return departmentRepository.queryPage(query);
    }

    @Override
    public List<TDepartmentDTO> selectList(TDepartmentQuery query) {
        return departmentRepository.queryTop(query);
    }

    @Override
    public TDepartmentDTO selectOne(TDepartmentQuery query) {
        return departmentRepository.queryFirst(query);
    }

    @Override
    public TDepartmentDTO get(Long id) {
        return departmentRepository.get(id);
    }
}