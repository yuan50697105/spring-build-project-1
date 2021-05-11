package org.example.spring.domains.mysql.auth.service;

import org.example.spring.models.mysql.auth.entity.query.RoleQuery;
import org.example.spring.models.mysql.auth.entity.result.Role;
import org.example.spring.models.mysql.auth.entity.result.RoleDetails;
import org.example.spring.models.mysql.auth.entity.vo.RoleModelVo;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;

public interface RoleService {
    IPageData<Role> queryPage(RoleQuery query);

    List<Role> queryList(RoleQuery query);

    Role queryOne(RoleQuery query);

    RoleDetails get(Long id);

    void save(RoleModelVo formVo);

    void update(RoleModelVo formVo);

    void delete(List<Long> ids);
}
