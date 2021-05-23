package org.example.spring.domains.services.mysql.auth.service;

import org.example.spring.daos.mysql.auth.table.dto.TRoleDTO;
import org.example.spring.daos.mysql.auth.table.vo.TRoleVo;
import org.example.spring.domains.repositories.mysql.auth.entity.query.DRoleQuery;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;

public interface DRoleService {

    IPageData<TRoleDTO> queryPage(DRoleQuery query);

    List<TRoleDTO> queryList(DRoleQuery query);

    TRoleDTO queryOne(DRoleQuery query);

    TRoleDTO get(Long id);

    void save(TRoleVo vo);

    void update(TRoleVo vo);

    void delete(List<Long> ids);

    void delete(Long... ids);

    void delete(Long id);

}
