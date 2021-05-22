package org.example.spring.domains.repositories.mysql.auth.repository.impl;

import org.example.spring.daos.mysql.auth.builder.TDepartmentBuilder;
import org.example.spring.daos.mysql.auth.builder.TDepartmentRoleBuilder;
import org.example.spring.daos.mysql.auth.dao.TDepartmentDao;
import org.example.spring.daos.mysql.auth.dao.TDepartmentRoleDao;
import org.example.spring.daos.mysql.auth.repository.TRole2Repository;
import org.example.spring.daos.mysql.auth.repository.impl.TDepartment2RepositoryImpl;
import org.example.spring.domains.repositories.mysql.auth.repository.DDepartment2Repository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@Primary
public class DDepartment2RepositoryImpl extends TDepartment2RepositoryImpl implements DDepartment2Repository {
    private final TDepartmentDao departmentDao;
    private final TDepartmentRoleDao departmentRoleDao;
    private final TDepartmentBuilder departmentBuilder;
    private final TDepartmentRoleBuilder departmentRoleBuilder;
    private final TRole2Repository role2Repository;

    public DDepartment2RepositoryImpl(TDepartmentDao departmentDao, TDepartmentRoleDao departmentRoleDao, TDepartmentBuilder departmentBuilder, TDepartmentRoleBuilder departmentRoleBuilder, TRole2Repository role2Repository) {
        super(departmentDao, departmentRoleDao, departmentBuilder, departmentRoleBuilder, role2Repository);
        this.departmentDao = departmentDao;
        this.departmentRoleDao = departmentRoleDao;
        this.departmentBuilder = departmentBuilder;
        this.departmentRoleBuilder = departmentRoleBuilder;
        this.role2Repository = role2Repository;
    }

}