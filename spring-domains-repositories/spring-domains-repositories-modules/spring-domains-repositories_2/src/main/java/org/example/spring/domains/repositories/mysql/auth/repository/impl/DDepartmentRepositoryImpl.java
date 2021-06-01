package org.example.spring.domains.repositories.mysql.auth.repository.impl;

import org.example.spring.repositories.mysql.auth.dao.TDepartmentDao;
import org.example.spring.repositories.mysql.auth.dao.TDepartmentRoleDao;
import org.example.spring.repositories.mysql.auth.repository.TRoleRepository;
import org.example.spring.repositories.mysql.auth.repository.impl.TDepartmentRepositoryImpl;
import org.example.spring.domains.repositories.mysql.auth.repository.DDepartmentRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@Primary
public class DDepartmentRepositoryImpl extends TDepartmentRepositoryImpl implements DDepartmentRepository {
    private final TDepartmentDao departmentDao;
    private final TDepartmentRoleDao departmentRoleDao;
    private final TRoleRepository role2Repository;

    public DDepartmentRepositoryImpl(TDepartmentDao departmentDao, TDepartmentRoleDao departmentRoleDao, TRoleRepository role2Repository) {
        super(departmentDao, departmentRoleDao, role2Repository);
        this.departmentDao = departmentDao;
        this.departmentRoleDao = departmentRoleDao;
        this.role2Repository = role2Repository;
    }
}