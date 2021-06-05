package org.example.spring.applications.web.auth.service;


import org.example.spring.applications.web.auth.entity.PhoneMessageDTO;
import org.example.spring.domains.services.mysql.auth.service.DAccountService;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.auth.dto.UserDTO;
import org.example.spring.repositories.commons.auth.query.UserQuery;
import org.example.spring.repositories.commons.auth.vo.UserVo;

import java.util.List;

public interface AAccountService extends DAccountService {
    IPageData<UserDTO> queryPage(UserQuery query);

    List<UserDTO> queryList(UserQuery withSize);

    UserDTO queryOne(UserQuery query);

    UserDTO get(Long id);

    void save(UserVo formVo);

    void update(UserVo formVo);

    void delete(List<Long> list);

    void updateStatus(String status, List<Long> list);

    void sendMessage(PhoneMessageDTO phoneMessageDTO);
}
