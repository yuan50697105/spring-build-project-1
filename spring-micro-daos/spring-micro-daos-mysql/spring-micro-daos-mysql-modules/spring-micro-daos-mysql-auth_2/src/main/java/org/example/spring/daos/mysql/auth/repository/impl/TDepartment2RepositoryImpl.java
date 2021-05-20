package org.example.spring.daos.mysql.auth.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.auth.builder.TDepartmentBuilder;
import org.example.spring.daos.mysql.auth.builder.TDepartmentRoleBuilder;
import org.example.spring.daos.mysql.auth.converter.TDepartmentConverter;
import org.example.spring.daos.mysql.auth.dao.TDepartmentDao;
import org.example.spring.daos.mysql.auth.dao.TDepartmentRoleDao;
import org.example.spring.daos.mysql.auth.repository.TDepartment2Repository;
import org.example.spring.daos.mysql.auth.repository.TRole2Repository;
import org.example.spring.daos.mysql.auth.table.dto.TDepartmentDTO;
import org.example.spring.daos.mysql.auth.table.dto.TDepartmentRoleDTO;
import org.example.spring.daos.mysql.auth.table.po.TDepartment;
import org.example.spring.daos.mysql.auth.table.po.TDepartmentRole;
import org.example.spring.daos.mysql.auth.table.query.TDepartmentQuery;
import org.example.spring.daos.mysql.auth.table.vo.TDepartmentVo;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
@Transactional
public class TDepartment2RepositoryImpl extends IBaseRepositoryImpl<TDepartment, TDepartmentDTO, TDepartmentVo, TDepartmentQuery, TDepartmentConverter, TDepartmentDao> implements TDepartment2Repository {
    private final TDepartmentDao departmentDao;
    private final TDepartmentRoleDao departmentRoleDao;
    private final TDepartmentBuilder departmentBuilder;
    private final TDepartmentRoleBuilder departmentRoleBuilder;
    private final TRole2Repository role2Repository;

    @Override
    public void save(TDepartmentVo tDepartmentVo) {
        TDepartment department = departmentBuilder.toPo(tDepartmentVo);
        departmentDao.save(department);
        List<TDepartmentRole> roleList = departmentRoleBuilder.buildRoles(department.getId(), tDepartmentVo.getRoleIds());
        departmentRoleDao.saveBatch(roleList);
    }

    @Override
    public void update(TDepartmentVo tDepartmentVo) {
        Long id = tDepartmentVo.getId();
        List<Long> roleIds = tDepartmentVo.getRoleIds();
        Optional<TDepartment> optional = departmentDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TDepartment tDepartment = optional.get();
            departmentBuilder.copy(tDepartmentVo, tDepartment);
            departmentDao.updateSelective(tDepartment);
            departmentRoleDao.removeByDepartmentId(id);
            departmentRoleDao.saveBatch(departmentRoleBuilder.buildRoles(id, roleIds));
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
        return departmentBuilder.toDTO(get(id), role2Repository.queryListByDepartmentId(id));
    }
}