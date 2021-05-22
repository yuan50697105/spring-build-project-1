package org.example.spring.models.mysql.auth.repository;


import org.example.spring.daos.mysql.table.enumerate.TUserStatus;
import org.example.spring.models.mysql.auth.entity.query.DAccountQuery;
import org.example.spring.models.mysql.auth.entity.result.DAccountDTO;
import org.example.spring.models.mysql.auth.entity.result.DAccountDetailsDTO;
import org.example.spring.models.mysql.auth.entity.result.DAccountRoleDetailsDTO;
import org.example.spring.models.mysql.auth.entity.vo.DAccountVo;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;

public interface DAccountRepository {
    void save(DAccountVo account);

    void update(DAccountVo account);

    void updateStatus(TUserStatus status, Long id);

    void updateStatus(TUserStatus status, Long... ids);

    void updateStatus(TUserStatus status, List<Long> ids);

    void delete(Long id);

    void delete(Long... ids);

    void delete(List<Long> ids);

    DAccountDTO get(Long id);

    DAccountRoleDetailsDTO getDetails(Long id);

    DAccountDetailsDTO getAllDetails(Long id);

    List<DAccountDTO> list(DAccountQuery query);

    List<DAccountDTO> top(DAccountQuery query);

    DAccountDTO first(DAccountQuery query);

    DAccountDTO one(DAccountQuery query);

    IPageData<DAccountDTO> page(DAccountQuery query);
}
