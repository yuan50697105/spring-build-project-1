package org.example.spring.repositories.auth.oracle.repository.impl;

import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.auth.oracle.converter.TDepartmentConverter;
import org.example.spring.repositories.auth.oracle.dao.TDepartmentDao;
import org.example.spring.repositories.auth.oracle.dao.TDepartmentRoleDao;
import org.example.spring.repositories.auth.oracle.repository.TDepartmentRepository;
import org.example.spring.repositories.auth.oracle.repository.TRoleRepository;
import org.example.spring.repositories.auth.oracle.table.dto.TDepartmentDTO;
import org.example.spring.repositories.auth.oracle.table.dto.TDepartmentRoleDTO;
import org.example.spring.repositories.auth.oracle.table.po.TDepartment;
import org.example.spring.repositories.auth.oracle.table.po.TDepartmentRole;
import org.example.spring.repositories.auth.oracle.table.query.TDepartmentQuery;
import org.example.spring.repositories.auth.oracle.table.vo.TDepartmentVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
@Deprecated
public class TDepartmentRepositoryImpl extends IBaseRepositoryImpl<TDepartment, TDepartmentDTO, TDepartmentVo, TDepartmentQuery, TDepartmentConverter, TDepartmentDao> implements TDepartmentRepository {
    private final TDepartmentDao departmentDao;
    private final TDepartmentRoleDao departmentRoleDao;
    private final TRoleRepository roleRepository;

    public TDepartmentRepositoryImpl(TDepartmentDao departmentDao, TDepartmentRoleDao departmentRoleDao, TRoleRepository roleRepository) {
        this.departmentDao = departmentDao;
        this.departmentRoleDao = departmentRoleDao;
        this.roleRepository = roleRepository;
    }

    @Override
    public void save(TDepartmentVo tDepartmentVo) {
        TDepartment department = converter.buildPo(tDepartmentVo);
        departmentDao.save(department);
        List<TDepartmentRole> roleList = converter.roles(department.getId(), tDepartmentVo.getRoleIds());
        departmentRoleDao.saveBatch(roleList);
    }

    @Override
    public void update(TDepartmentVo tDepartmentVo) {
        Long id = tDepartmentVo.getId();
        List<Long> roleIds = tDepartmentVo.getRoleIds();
        Optional<TDepartment> optional = departmentDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TDepartment tDepartment = optional.get();
            converter.departmentCopy(tDepartmentVo, tDepartment);
            departmentDao.updateSelective(tDepartment);
            departmentRoleDao.removeByDepartmentId(id);
            departmentRoleDao.saveBatch(converter.roles(id, roleIds));
        }
    }


    @Override
    public void delete(Long id) {
        departmentDao.validateDelete(Collections.singletonList(id));
        departmentDao.deleteById(id);
        departmentRoleDao.removeByDepartmentId(id);
    }

    @Override
    public void delete(Long... ids) {
        departmentDao.validateDelete(Arrays.asList(ids));
        departmentDao.deleteByIds(ids);
        departmentRoleDao.removeByDepartmentIds(Arrays.asList(ids));
    }

    @Override
    public void delete(List<Long> ids) {
        departmentDao.validateDelete(ids);
        departmentDao.deleteByIds(ids);
        departmentRoleDao.removeByDepartmentIds(ids);
    }

    @Override
    public TDepartmentRoleDTO getDetails(Long id) {
        TDepartmentRoleDTO dto = new TDepartmentRoleDTO();
        converter.copyDepartmentRoleDTO(dao.getById(id), dto);
        dto.setRoles(roleRepository.queryListByDepartmentId(id));
        return dto;
    }
}