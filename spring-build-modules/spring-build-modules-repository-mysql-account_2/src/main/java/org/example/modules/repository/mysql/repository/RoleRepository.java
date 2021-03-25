package org.example.modules.repository.mysql.repository;

import org.example.modules.repository.mysql.entity.query.RoleQuery;
import org.example.modules.repository.mysql.entity.vo.RoleDetailVo;
import org.example.modules.repository.mysql.entity.vo.RoleFormVo;
import org.example.modules.repository.mysql.entity.vo.RoleVo;
import org.example.plugins.mybatis.repository.IBaseRepository;

public interface RoleRepository extends IBaseRepository<RoleVo, RoleFormVo, RoleDetailVo, RoleQuery> {
}
