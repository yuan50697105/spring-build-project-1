package org.example.spring.domains.services.mysql.auth.service;

import org.example.spring.domains.repositories.mysql.auth.entity.query.DRoleQuery;
import org.example.spring.domains.repositories.mysql.auth.entity.result.DRoleDTO;
import org.example.spring.domains.repositories.mysql.auth.entity.result.DRoleDetailsDTO;
import org.example.spring.domains.repositories.mysql.auth.entity.vo.DRoleVo;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;

public interface DRoleService {

    IPageData<DRoleDTO> queryPage(DRoleQuery query);

    List<DRoleDTO> queryList(DRoleQuery query);

    DRoleDTO queryOne(DRoleQuery query);

    DRoleDetailsDTO get(Long id);

    void save(DRoleVo vo);

    void update(DRoleVo vo);

    void delete(List<Long> ids);

    void delete(Long... ids);

    void delete(Long id);

}