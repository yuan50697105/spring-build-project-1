package org.example.spring.models.auth.repository;

import org.example.spring.models.auth.entity.query.RoleQuery;
import org.example.spring.models.auth.entity.result.Role;
import org.example.spring.models.auth.entity.result.RoleDetails;
import org.example.spring.models.auth.entity.vo.RoleFormVo;
import org.example.spring.models.commons.repository.IBaseRepository;

public interface RoleRepository extends IBaseRepository<Role, RoleFormVo, RoleDetails, RoleQuery> {
}
