package org.example.spring.daos.postgres.auth.repository.impl;

import org.example.spring.daos.postgres.auth.converter.TDepartmentConverter;
import org.example.spring.daos.postgres.auth.dao.TDepartmentDao;
import org.example.spring.daos.postgres.auth.dao.TDepartmentRoleDao;
import org.example.spring.daos.postgres.auth.repository.TDepartmentRepository;
import org.example.spring.daos.postgres.auth.repository.TRoleRepository;
import org.example.spring.daos.postgres.auth.table.dto.TDepartmentDTO;
import org.example.spring.daos.postgres.auth.table.dto.TDepartmentRoleDTO;
import org.example.spring.daos.postgres.auth.table.po.TDepartment;
import org.example.spring.daos.postgres.auth.table.po.TDepartmentRole;
import org.example.spring.daos.postgres.auth.table.query.TDepartmentQuery;
import org.example.spring.daos.postgres.auth.table.vo.TDepartmentVo;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class TDepartmentRepositoryImpl extends IBaseRepositoryImpl<TDepartment, TDepartmentDTO, TDepartmentVo, TDepartmentQuery, TDepartmentConverter, TDepartmentDao> implements TDepartmentRepository {
    private final TDepartmentDao departmentDao;
    private final TDepartmentRoleDao departmentRoleDao;
    private final TRoleRepository role2Repository;

    public TDepartmentRepositoryImpl(TDepartmentDao departmentDao, TDepartmentRoleDao departmentRoleDao, TRoleRepository role2Repository) {
        this.departmentDao = departmentDao;
        this.departmentRoleDao = departmentRoleDao;
        this.role2Repository = role2Repository;
    }

    @Override
    public void save(TDepartmentVo tDepartmentVo) {
        TDepartment department = converter.department(tDepartmentVo);
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
        TDepartmentRoleDTO departmentRoleDTO = converter.department(get(id));
        departmentRoleDTO.setRoles(role2Repository.queryListByDepartmentId(id));
        return departmentRoleDTO;
    }
}