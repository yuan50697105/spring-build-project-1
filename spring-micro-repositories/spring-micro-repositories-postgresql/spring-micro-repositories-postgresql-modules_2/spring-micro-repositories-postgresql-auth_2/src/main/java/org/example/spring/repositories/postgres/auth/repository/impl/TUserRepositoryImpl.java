package org.example.spring.repositories.postgres.auth.repository.impl;

import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.commons.enumerate.UserStatus;
import org.example.spring.repositories.postgres.auth.converter.TUserConverter;
import org.example.spring.repositories.postgres.auth.dao.TUserDao;
import org.example.spring.repositories.postgres.auth.repository.TResourceRepository;
import org.example.spring.repositories.postgres.auth.repository.TRoleRepository;
import org.example.spring.repositories.postgres.auth.repository.TUserRepository;
import org.example.spring.repositories.postgres.auth.table.dto.TUserDTO;
import org.example.spring.repositories.postgres.auth.table.dto.TUserRoleDTO;
import org.example.spring.repositories.postgres.auth.table.dto.TUserRoleResourceDTO;
import org.example.spring.repositories.postgres.auth.table.po.TUser;
import org.example.spring.repositories.postgres.auth.table.query.TUserQuery;
import org.example.spring.repositories.postgres.auth.table.vo.TUserVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
@Transactional
public class TUserRepositoryImpl extends IBaseRepositoryImpl<TUser, TUserDTO, TUserVo, TUserQuery, TUserConverter, TUserDao> implements TUserRepository {
    private final TRoleRepository roleRepository;
    private final TResourceRepository resourceRepository;

    public TUserRepositoryImpl(TRoleRepository roleRepository, TResourceRepository resourceRepository) {
        this.roleRepository = roleRepository;
        this.resourceRepository = resourceRepository;
    }

    @Override
    public TUserRoleResourceDTO getWithRoleAndResource(Long id) {
        TUserRoleResourceDTO dto = converter.buildDTO2(get(id));
        dto.setRoles(roleRepository.queryListByUserId(id));
        dto.setResources(resourceRepository.queryListByUserId(id));
        return dto;
    }

    @Override
    public TUserRoleDTO getWithRole(Long id) {
        TUserRoleDTO tUserRoleDTO = converter.buildDTO3(get(id));
        tUserRoleDTO.setRoles(roleRepository.queryListByUserId(id));
        return tUserRoleDTO;
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