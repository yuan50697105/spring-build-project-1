package org.example.spring.daos.mysql.auth.client;

import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.daos.mysql.auth.builder.DepartmentClientBuilder;
import org.example.spring.daos.mysql.auth.entity.dto.DepartmentDTO;
import org.example.spring.daos.mysql.auth.entity.query.DepartmentQuery;
import org.example.spring.daos.mysql.auth.entity.vo.DepartmentVo;
import org.example.spring.daos.mysql.auth.repository.TDepartmentRepository;
import org.example.spring.daos.mysql.auth.table.dto.TDepartmentDTO;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ValidationException;
import java.util.List;
import java.util.Optional;

@RestController
@DubboService
@AllArgsConstructor
@Transactional
public class DepartmentDaoClientImpl implements DepartmentDaoClient {
    private final DepartmentClientBuilder departmentClientBuilder;
    private final TDepartmentRepository departmentRepository;
    @Override
    @Transactional
    public void save(DepartmentVo departmentVo) {
        departmentRepository.save(departmentClientBuilder.build(departmentVo));
    }

    @Override
    @Transactional
    public void update(DepartmentVo departmentVo) {
        departmentRepository.update(departmentClientBuilder.build(departmentVo));
    }


    @Override
    public void delete(List<Long> ids) {
        validateDepartment(ids);
        departmentRepository.delete(ids);
    }

    private void validateDepartment(List<Long> ids) {
        if (departmentRepository.validateDelete(ids)) {
            throw new ValidationException("存在子级部门，不能删除");
        }
    }

    @Override
    public DepartmentDTO get(Long id) {
        return departmentClientBuilder.buildDTO(departmentRepository.get(id));
    }

    @Override
    public IPageData<DepartmentDTO> data(DepartmentQuery query) {
        IPageData<TDepartmentDTO> data = departmentRepository.queryPage(departmentClientBuilder.query(query));
        return departmentClientBuilder.buildDTO(data);
    }

    @Override
    public List<DepartmentDTO> list(DepartmentQuery query) {
        List<TDepartmentDTO> list = departmentRepository.queryTop(departmentClientBuilder.query(query));
        return departmentClientBuilder.buildDTO(list);
    }

    @Override
    public Optional<DepartmentDTO> one(DepartmentQuery query) {
        TDepartmentDTO optional = departmentRepository.queryFirst(departmentClientBuilder.query(query));
        return Optional.ofNullable(departmentClientBuilder.buildDTO(optional));
    }

}