package org.example.spring.domains.auth.service;

import org.example.spring.infrastructures.mysql.auth.entity.query.RoleQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Role;
import org.example.spring.infrastructures.mysql.auth.entity.result.RoleDetails;
import org.example.spring.infrastructures.mysql.auth.entity.vo.RoleFormVo;
import org.example.spring.plugins.mybatis.entity.IPageData;

import java.util.List;

public interface RoleService {
    IPageData<Role> queryPage(RoleQuery query);

    List<Role> queryList(RoleQuery query);

    List<Role> queryTop(RoleQuery query);

    Role queryFirst(RoleQuery query);

    Role queryOne(RoleQuery query);

    RoleDetails get(Long id);

    void save(RoleFormVo formVo);

    void update(RoleFormVo formVo);

    void delete(List<Long> ids);
}
