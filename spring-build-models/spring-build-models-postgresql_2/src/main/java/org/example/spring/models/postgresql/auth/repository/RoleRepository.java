package org.example.spring.models.postgresql.auth.repository;

import org.example.spring.models.commons.repository.IBaseRepository;
import org.example.spring.models.postgresql.auth.entity.query.RoleQuery;
import org.example.spring.models.postgresql.auth.entity.result.Role;
import org.example.spring.models.postgresql.auth.entity.result.RoleDetails;
import org.example.spring.models.postgresql.auth.entity.vo.RoleModelVo;

public interface RoleRepository extends IBaseRepository<Role, RoleModelVo, RoleDetails, RoleQuery> {
}
