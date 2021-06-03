package org.example.spring.domains.services.mysql.auth.service;


import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.auth.dto.RoleDTO;
import org.example.spring.repositories.commons.auth.query.RoleQuery;
import org.example.spring.repositories.commons.auth.vo.RoleVo;

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
