package org.example.spring.domains.services.mysql.auth.service.impl;

import lombok.AllArgsConstructor;
import org.example.spring.domains.services.impl.DServiceImpl;
import org.example.spring.domains.services.mysql.auth.service.DAccount2Service;
import org.example.spring.repositories.clients.auth.api.UserRepository;
import org.example.spring.repositories.commons.auth.dto.UserDTO;
import org.example.spring.repositories.commons.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.auth.dto.UserRoleResourceDTO;
import org.example.spring.repositories.commons.auth.po.User;
import org.example.spring.repositories.commons.auth.query.UserQuery;
import org.example.spring.repositories.commons.auth.vo.UserVo;
import org.example.spring.repositories.commons.enumerate.UserStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DAccount2ServiceImpl extends DServiceImpl<User, UserVo, UserDTO, UserQuery, UserRepository> implements DAccount2Service {
    @Override
    public UserRoleDTO getWithRole(Long id) {
        return repository.getWithRole(id);
    }

    @Override
    public UserRoleResourceDTO getWithRoleAndResource(Long id) {
        return repository.getWithRoleResource(id);
    }

    @Override
    public void updateStatus(UserStatus status, List<Long> ids) {
        ids.stream().map(value -> {
            UserVo userVo = new UserVo();
            userVo.setStatus(status.getValue());
            userVo.setId(value);
            return userVo;
        }).forEach(repository::update);
    }
}