package org.example.spring.repositories.auth.repository.impl;

import org.example.spring.plugins.mybatis.repository.impl.ICommonsRepositoryImpl;
import org.example.spring.repositories.commons.entity.auth.dto.UserDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.User;
import org.example.spring.repositories.commons.entity.auth.query.UserQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;
import org.example.spring.repositories.commons.enumerate.UserStatus;
import org.example.spring.repositories.auth.converter.UserConverter;
import org.example.spring.repositories.auth.dao.TUserDao;
import org.example.spring.repositories.auth.repository.ResourceRepository;
import org.example.spring.repositories.auth.repository.RoleRepository;
import org.example.spring.repositories.auth.repository.UserRepository;
import org.example.spring.repositories.auth.table.po.TUser;
import org.example.spring.repositories.auth.table.query.TUserQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
@Transactional
public class UserRepositoryImpl extends ICommonsRepositoryImpl<User, TUser, UserQuery, TUserQuery, UserVo, UserDTO, UserConverter, TUserDao> implements UserRepository {
    private final UserConverter converter;
    private final TUserDao dao;
    private final RoleRepository roleRepository;
    private final ResourceRepository resourceRepository;

    public UserRepositoryImpl(UserConverter converter, TUserDao dao, RoleRepository roleRepository, ResourceRepository resourceRepository) {
        super(converter, dao);
        this.converter = converter;
        this.dao = dao;
        this.roleRepository = roleRepository;
        this.resourceRepository = resourceRepository;
    }


    @Override
    public UserRoleResourceDTO getWithRoleAndResource(Long id) {
        UserRoleResourceDTO dto = new UserRoleResourceDTO();
        converter.copyUserRoleResourceDTO(dao.getById(id), dto);
        dto.setRoles(roleRepository.queryListByUserId(id));
        dto.setResources(resourceRepository.queryTreeByUserId(id));
        return dto;
    }

    @Override
    public UserRoleDTO getWithRole(Long id) {
        UserRoleDTO dto = new UserRoleDTO();
        converter.copyUserRoleDTO(dao.getById(id), dto);
        dto.setRoles(roleRepository.queryListByUserId(id));
        return dto;
    }

    @Override
    public void updateStatus(UserStatus status, List<Long> ids) {
        dao.updateStatusByIds(status.getValue(), ids);
    }

    @Override
    public void updateStatus(UserStatus status, Long... ids) {
        updateStatus(status, Arrays.asList(ids));
    }

    @Override
    public void updateStatus(UserStatus status, Long id) {
        updateStatus(status, Collections.singletonList(id));
    }
}