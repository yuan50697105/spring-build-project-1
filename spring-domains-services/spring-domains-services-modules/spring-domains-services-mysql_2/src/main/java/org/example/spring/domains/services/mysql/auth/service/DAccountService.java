package org.example.spring.domains.services.mysql.auth.service;

import org.example.spring.daos.mysql.table.enumerate.TUserStatus;
import org.example.spring.domains.repositories.mysql.auth.entity.query.DAccountQuery;
import org.example.spring.domains.repositories.mysql.auth.entity.result.DAccountDTO;
import org.example.spring.domains.repositories.mysql.auth.entity.result.DAccountRoleDTO;
import org.example.spring.domains.repositories.mysql.auth.entity.vo.DAccountVo;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;

public interface DAccountService {
    IPageData<DAccountDTO> queryPage(DAccountQuery query);

    List<DAccountDTO> queryList(DAccountQuery query);

    DAccountDTO queryOne(DAccountQuery query);

    DAccountRoleDTO get(Long id);

    void save(DAccountVo formVo);

    void update(DAccountVo formVo);

    void delete(List<Long> ids);

    void updateStatus(TUserStatus status, List<Long> ids);
}
