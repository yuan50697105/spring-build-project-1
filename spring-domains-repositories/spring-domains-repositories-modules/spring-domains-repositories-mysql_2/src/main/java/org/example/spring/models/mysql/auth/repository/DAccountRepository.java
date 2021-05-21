package org.example.spring.models.mysql.auth.repository;


import org.example.spring.models.mysql.auth.entity.query.DAccountQuery;
import org.example.spring.models.mysql.auth.entity.result.DAccountDTO;
import org.example.spring.models.mysql.auth.entity.result.DAccountDetailsDTO;
import org.example.spring.models.mysql.auth.entity.vo.DAccountVo;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;

public interface DAccountRepository {
    void save(DAccountVo account);

    void update(DAccountVo account);

    DAccountDTO get(Long id);

    DAccountDetailsDTO getDetails(Long id);

    List<DAccountDTO> list(DAccountQuery query);

    List<DAccountDTO> top(DAccountQuery query);

    DAccountDTO first(DAccountQuery query);

    DAccountDTO one(DAccountQuery query);

    IPageData<DAccountDTO> page(DAccountQuery query);
}
