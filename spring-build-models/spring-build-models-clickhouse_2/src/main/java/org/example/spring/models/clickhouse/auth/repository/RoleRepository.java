package org.example.spring.models.clickhouse.auth.repository;

import org.example.spring.models.clickhouse.auth.entity.query.RoleQuery;
import org.example.spring.models.clickhouse.auth.entity.result.Role;
import org.example.spring.models.clickhouse.auth.entity.result.RoleDetails;
import org.example.spring.models.clickhouse.auth.entity.vo.RoleModelVo;
import org.example.spring.models.commons.repository.IBaseRepository;

public interface RoleRepository extends IBaseRepository<Role, RoleModelVo, RoleDetails, RoleQuery> {
}
