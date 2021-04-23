package org.example.spring.models.mysql.auth.repository;

import org.example.spring.models.mysql.auth.entity.query.RoleQuery;
import org.example.spring.models.mysql.auth.entity.result.Role;
import org.example.spring.models.mysql.auth.entity.result.RoleDetails;
import org.example.spring.models.mysql.auth.entity.vo.RoleModelVo;
import org.example.spring.models.commons.repository.IBaseRepository;

public interface RoleRepository extends IBaseRepository<Role, RoleModelVo, RoleDetails, RoleQuery> {
}
