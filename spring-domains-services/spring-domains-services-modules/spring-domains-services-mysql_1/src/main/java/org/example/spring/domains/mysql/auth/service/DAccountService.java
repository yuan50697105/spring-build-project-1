package org.example.spring.domains.mysql.auth.service;

import org.example.spring.daos.mysql.table.enumerate.TUserStatus;
import org.example.spring.models.mysql.auth.entity.query.DAccountQuery;
import org.example.spring.models.mysql.auth.entity.result.DAccountDTO;
import org.example.spring.models.mysql.auth.entity.result.DAccountDetailsDTO;
import org.example.spring.models.mysql.auth.entity.vo.DAccountVo;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;

public interface DAccountService {
    IPageData<DAccountDTO> page(DAccountQuery query);

    List<DAccountDTO> list(DAccountQuery query);

    DAccountDTO one(DAccountQuery query);

    DAccountDTO first(DAccountQuery query);

    DAccountDetailsDTO get(Long id);

    void save(DAccountVo formVo);

    void update(DAccountVo formVo);

    void delete(List<Long> ids);

    void updateStatusByIs(TUserStatus status, List<Long> ids);
}
