package org.example.spring.domains.services.mysql.auth.service;

import org.example.spring.daos.mysql.auth.table.dto.TUserDTO;
import org.example.spring.daos.mysql.auth.table.dto.TUserRoleDTO;
import org.example.spring.daos.mysql.auth.table.dto.TUserRoleResourceDTO;
import org.example.spring.daos.mysql.auth.table.query.TUserQuery;
import org.example.spring.daos.mysql.auth.table.vo.TUserVo;
import org.example.spring.daos.mysql.table.enumerate.TUserStatus;
import org.example.spring.domains.repositories.mysql.auth.entity.query.DAccountQuery;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;

public interface DAccountService {

    IPageData<TUserDTO> queryPage(TUserQuery query);

    List<TUserDTO> queryList(DAccountQuery query);

    TUserDTO queryOne(DAccountQuery query);

    TUserDTO get(Long id);

    TUserRoleDTO getWithRole(Long id);

    TUserRoleResourceDTO getWithRoleAndResource(Long id);

    void save(TUserVo formVo);

    void update(TUserVo formVo);

    void delete(List<Long> ids);

    void delete(Long... ids);

    void delete(Long id);

    void updateStatus(TUserStatus status, List<Long> ids);
}
