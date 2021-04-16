package org.example.spring.domains.auth.service;

import org.example.spring.models.auth.entity.query.RoleQuery;
import org.example.spring.models.auth.entity.result.Role;
import org.example.spring.models.auth.entity.result.RoleDetails;
import org.example.spring.models.auth.entity.vo.RoleFormVo;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;

public interface RoleService {
    IPageData<Role> queryPage(RoleQuery query);

    List<Role> queryList(RoleQuery query);

    Role queryOne(RoleQuery query);

    RoleDetails get(Long id);

    void save(RoleFormVo formVo);

    void update(RoleFormVo formVo);

    void delete(List<Long> ids);
}
