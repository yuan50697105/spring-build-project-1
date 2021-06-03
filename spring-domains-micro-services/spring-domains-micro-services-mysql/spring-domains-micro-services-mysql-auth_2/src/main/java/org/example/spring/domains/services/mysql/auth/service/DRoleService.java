package org.example.spring.domains.services.mysql.auth.service;

import org.example.spring.repositories.mysql.auth.table.dto.RoleDTO;
import org.example.spring.repositories.mysql.auth.table.query.RoleQuery;
import org.example.spring.repositories.mysql.auth.table.vo.RoleVo;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;

public interface DRoleService {

    IPageData<RoleDTO> queryPage(RoleQuery query);

    List<RoleDTO> queryList(RoleQuery query);

    RoleDTO queryOne(RoleQuery query);

    RoleDTO get(Long id);

    void save(RoleVo vo);

    void update(RoleVo vo);

    void delete(List<Long> ids);

    void delete(Long... ids);

    void delete(Long id);

}
