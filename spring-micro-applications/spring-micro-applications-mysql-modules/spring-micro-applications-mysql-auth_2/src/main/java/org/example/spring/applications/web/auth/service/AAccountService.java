package org.example.spring.applications.web.auth.service;

import org.example.spring.applications.web.auth.entity.PhoneMessageDTO;
import org.example.spring.domains.repositories.mysql.auth.entity.query.DAccountQuery;
import org.example.spring.domains.repositories.mysql.auth.entity.result.DAccountDTO;
import org.example.spring.domains.repositories.mysql.auth.entity.result.DAccountRoleDetailsDTO;
import org.example.spring.domains.repositories.mysql.auth.entity.vo.DAccountVo;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;

public interface AAccountService {
    IPageData<DAccountDTO> queryPage(DAccountQuery query);

    List<DAccountDTO> queryList(DAccountQuery withSize);

    DAccountDTO queryOne(DAccountQuery query);

    DAccountRoleDetailsDTO get(Long id);

    void save(DAccountVo formVo);

    void update(DAccountVo formVo);

    void delete(List<Long> list);

    void updateStatus(String status, List<Long> list);

    void sendMessage(PhoneMessageDTO phoneMessageDTO);
}
