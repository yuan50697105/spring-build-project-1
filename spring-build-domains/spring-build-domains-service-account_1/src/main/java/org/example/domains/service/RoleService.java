package org.example.domains.service;

import org.example.modules.repository.mysql.entity.query.RoleQuery;
import org.example.modules.repository.mysql.entity.result.Role;
import org.example.modules.repository.mysql.entity.result.RoleDetails;
import org.example.modules.repository.mysql.entity.vo.RoleFormVo;
import org.example.plugins.mybatis.entity.IPageData;

import java.util.List;

public interface RoleService {
    void save(RoleFormVo formVo);

    void update(RoleFormVo formVo);

    RoleDetails get(Long id);

    Role queryOne(RoleQuery query);

    List<Role> queryList(RoleQuery query);

    IPageData<Role> queryPage(RoleQuery query);
}
