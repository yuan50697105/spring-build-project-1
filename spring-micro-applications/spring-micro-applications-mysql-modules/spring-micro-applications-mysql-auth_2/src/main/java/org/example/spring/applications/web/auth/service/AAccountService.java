package org.example.spring.applications.web.auth.service;

import org.example.spring.applications.web.auth.entity.PhoneMessageDTO;
import org.example.spring.daos.mysql.auth.table.dto.TUserDTO;
import org.example.spring.daos.mysql.auth.table.dto.TUserRoleDTO;
import org.example.spring.daos.mysql.auth.table.query.TUserQuery;
import org.example.spring.daos.mysql.auth.table.vo.TUserVo;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;

public interface AAccountService {
    IPageData<TUserDTO> queryPage(TUserQuery query);

    List<TUserDTO> queryList(TUserQuery withSize);

    TUserDTO queryOne(TUserQuery query);

    TUserDTO get(Long id);

    void save(TUserVo formVo);

    void update(TUserVo formVo);

    void delete(List<Long> list);

    void updateStatus(String status, List<Long> list);

    void sendMessage(PhoneMessageDTO phoneMessageDTO);
}
