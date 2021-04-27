package org.example.spring.models.auth.repository;

import org.example.spring.models.auth.entity.query.RoleQuery;
import org.example.spring.models.auth.entity.result.Role;
import org.example.spring.models.auth.entity.result.RoleDetails;
import org.example.spring.models.auth.entity.vo.RoleModelVo;
import org.example.spring.models.commons.repository.IBaseRepository;

public interface RoleRepository extends IBaseRepository<Role, RoleModelVo, RoleDetails, RoleQuery> {
}
