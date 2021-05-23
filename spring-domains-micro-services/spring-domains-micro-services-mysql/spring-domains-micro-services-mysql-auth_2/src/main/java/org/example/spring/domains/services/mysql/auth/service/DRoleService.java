package org.example.spring.domains.services.mysql.auth.service;

import org.example.spring.daos.mysql.auth.table.dto.TRoleDTO;
import org.example.spring.daos.mysql.auth.table.query.TRoleQuery;
import org.example.spring.daos.mysql.auth.table.vo.TRoleVo;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;

public interface DRoleService {

    IPageData<TRoleDTO> queryPage(TRoleQuery query);

    List<TRoleDTO> queryList(TRoleQuery query);

    TRoleDTO queryOne(TRoleQuery query);

    TRoleDTO get(Long id);

    void save(TRoleVo vo);

    void update(TRoleVo vo);

    void delete(List<Long> ids);

    void delete(Long... ids);

    void delete(Long id);

}
