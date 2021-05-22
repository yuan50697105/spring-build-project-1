package org.example.spring.domains.service.mysql.auth;

import org.example.spring.daos.mysql.table.enumerate.TUserStatus;
import org.example.spring.models.mysql.auth.entity.po.DAccount;
import org.example.spring.models.mysql.auth.entity.query.DAccountQuery;
import org.example.spring.models.mysql.auth.entity.result.DAccountDTO;
import org.example.spring.models.mysql.auth.entity.result.DAccountRoleDetailsDTO;
import org.example.spring.models.mysql.auth.entity.vo.DAccountVo;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;

public interface DAccountService {
    IPageData<DAccountDTO> queryPage(DAccountQuery query);

    List<DAccountDTO> queryList(DAccountQuery query);

    DAccount queryOne(DAccountQuery query);

    DAccountRoleDetailsDTO get(Long id);

    void save(DAccountVo formVo);

    void update(DAccountVo formVo);

    void delete(List<Long> ids);

    void updateStatus(TUserStatus status, List<Long> ids);
}
