package org.example.modules.repository.mysql.repository;

import org.example.modules.repository.mysql.entity.query.RoleQuery;
import org.example.modules.repository.mysql.entity.result.Role;
import org.example.modules.repository.mysql.entity.result.RoleDetails;
import org.example.modules.repository.mysql.entity.vo.RoleFormVo;
import org.example.plugins.mybatis.repository.IBaseRepository;

public interface RoleRepository extends IBaseRepository<Role, RoleFormVo, RoleDetails, RoleQuery> {
}
