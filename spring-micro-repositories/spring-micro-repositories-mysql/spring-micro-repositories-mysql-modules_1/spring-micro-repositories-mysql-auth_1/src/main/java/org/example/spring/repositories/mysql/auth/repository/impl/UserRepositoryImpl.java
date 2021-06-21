package org.example.spring.repositories.mysql.auth.repository.impl;

import org.example.spring.plugins.mybatis.repository.impl.ICommonsRepositoryImpl;
import org.example.spring.repositories.commons.entity.auth.dto.UserDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.User;
import org.example.spring.repositories.commons.entity.auth.query.UserQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;
import org.example.spring.repositories.commons.enumerate.UserStatus;
import org.example.spring.repositories.mysql.auth.converter.UserConverter;
import org.example.spring.repositories.mysql.auth.dao.TUserDao;
import org.example.spring.repositories.mysql.auth.repository.UserRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UserRepositoryImpl extends ICommonsRepositoryImpl<User, UserDTO, UserVo, UserQuery, UserConverter, TUserDao> implements UserRepository {
    protected UserRepositoryImpl(UserConverter converter, TUserDao dao) {
        super(converter, dao);
    }

    @Override
    public UserRoleResourceDTO getWithRoleAndResource(Long id) {
        return null;
    }

    @Override
    public UserRoleDTO getWithRole(Long id) {
        return null;
    }

    @Override
    public void updateStatus(UserStatus status, List<Long> ids) {

    }

    @Override
    public void updateStatus(UserStatus status, Long... ids) {

    }

    @Override
    public void updateStatus(UserStatus status, Long id) {

    }
}