package org.example.spring.infrastructures.mysql.auth.repository;

import org.example.spring.infrastructures.mysql.auth.entity.query.RoleQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Role;
import org.example.spring.infrastructures.mysql.auth.entity.result.RoleDetails;
import org.example.spring.infrastructures.mysql.auth.entity.vo.RoleFormVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface RoleRepository extends IBaseRepository<Role, RoleFormVo, RoleDetails, RoleQuery> {
}
