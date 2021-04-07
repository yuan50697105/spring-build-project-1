package org.example.spring.infrastructures.mysql.auth.repository;

import org.example.spring.infrastructures.mysql.auth.entity.query.PermissionQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Permission;
import org.example.spring.infrastructures.mysql.auth.entity.result.PermissionDetails;
import org.example.spring.infrastructures.mysql.auth.entity.vo.PermissionFormVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface PermissionRepository extends IBaseRepository<Permission, PermissionFormVo, PermissionDetails, PermissionQuery> {
}
