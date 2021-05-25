package org.example.spring.daos.mysql.auth.client;

import io.seata.spring.annotation.GlobalTransactional;
import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.daos.mysql.auth.converter.TDepartmentRepositoryClientConverter;
import org.example.spring.daos.mysql.auth.entity.dto.DepartmentDTO;
import org.example.spring.daos.mysql.auth.entity.query.DepartmentQuery;
import org.example.spring.daos.mysql.auth.entity.vo.DepartmentVo;
import org.example.spring.daos.mysql.auth.repository.TDepartmentRepository;
import org.example.spring.daos.mysql.auth.table.dto.TDepartmentDTO;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@DubboService
@AllArgsConstructor
public class ITDepartmentRepositoryClientImpl implements IDepartmentRepositoryClient {
    private final TDepartmentRepositoryClientConverter converter;
    private final TDepartmentRepository departmentRepository;

    @Override
    @GlobalTransactional
    public void save(DepartmentVo departmentVo) {
        departmentRepository.save(converter.build(departmentVo));
    }

    @Override
    @GlobalTransactional
    public void update(DepartmentVo departmentVo) {
        departmentRepository.update(converter.build(departmentVo));
    }


    @Override
    @GlobalTransactional
    public void delete(List<Long> ids) {
        departmentRepository.delete(ids);
    }

    @Override
    public DepartmentDTO get(Long id) {
        return converter.build(departmentRepository.get(id));
    }

    @Override
    public IPageData<DepartmentDTO> data(DepartmentQuery query) {
        IPageData<TDepartmentDTO> data = departmentRepository.queryPage(converter.build(query));
        return converter.build(data);
    }

    @Override
    public List<DepartmentDTO> list(DepartmentQuery query) {
        List<TDepartmentDTO> list = departmentRepository.queryTop(converter.build(query));
        return converter.build(list);
    }

    @Override
    public Optional<DepartmentDTO> one(DepartmentQuery query) {
        TDepartmentDTO optional = departmentRepository.queryFirst(converter.build(query));
        return Optional.ofNullable(converter.build(optional));
    }

}