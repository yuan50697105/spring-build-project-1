package org.example.spring.models.mysql.auth.repository.impl;


import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.auth.repository.TUserRepository;
import org.example.spring.daos.mysql.auth.table.dto.TUserDTO;
import org.example.spring.daos.mysql.auth.table.dto.TUserRoleDTO;
import org.example.spring.daos.mysql.auth.table.query.TUserQuery;
import org.example.spring.daos.mysql.table.enumerate.TUserStatus;
import org.example.spring.domains.repositories.mysql.auth.builder.DAccountBuilder;
import org.example.spring.domains.repositories.mysql.auth.entity.query.DAccountQuery;
import org.example.spring.domains.repositories.mysql.auth.entity.result.DAccountDTO;
import org.example.spring.domains.repositories.mysql.auth.entity.result.DAccountDetailsDTO;
import org.example.spring.domains.repositories.mysql.auth.entity.result.DAccountRoleDetailsDTO;
import org.example.spring.domains.repositories.mysql.auth.entity.vo.DAccountVo;
import org.example.spring.domains.repositories.mysql.auth.repository.DAccountRepository;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Repository
@AllArgsConstructor
@Transactional
public class DAccountRepositoryImpl implements DAccountRepository {
    private final DAccountBuilder accountBuilder;
    private final TUserRepository userRepository;

    @Override
    public void save(DAccountVo account) {
        userRepository.save(accountBuilder.build(account));
    }

    @Override
    public void update(DAccountVo account) {
        userRepository.update(accountBuilder.build(account));
    }

    @Override
    public void updateStatus(TUserStatus status, Long id) {
        DAccountVo vo = new DAccountVo();
        vo.setStatus(status.getValue());
        vo.setId(id);
        update(vo);
    }

    @Override
    public void updateStatus(TUserStatus status, Long... ids) {
        updateStatus(status,Arrays.asList(ids));
    }

    @Override
    public void updateStatus(TUserStatus status, List<Long> ids) {
        for (Long id : ids) {
            DAccountVo vo = new DAccountVo();
            vo.setStatus(status.getValue());
            vo.setId(id);
            updateStatus(status, id);
        }
    }

    @Override
    public void delete(Long id) {
        userRepository.delete(id);
    }

    @Override
    public void delete(Long... ids) {
        userRepository.delete(ids);
    }

    @Override
    public void delete(List<Long> ids) {
        userRepository.delete(ids);
    }

    @Override
    public DAccountDTO get(Long id) {
        return accountBuilder.build(userRepository.get(id));
    }

    @Override
    public DAccountRoleDetailsDTO getDetails(Long id) {
        TUserRoleDTO details = userRepository.getDetails(id);
        DAccountRoleDetailsDTO accountDetailsDTO = accountBuilder.build3(details);
        accountDetailsDTO.setRoles(accountBuilder.buildRoles2(details.getRoles()));
        return accountDetailsDTO;
    }

    @Override
    public DAccountDetailsDTO getAllDetails(Long id) {
        TUserRoleDTO details = userRepository.getDetails(id);
        DAccountDetailsDTO accountDetailsDTO = accountBuilder.build2(details);
        accountDetailsDTO.setRoles(accountBuilder.buildRoles2(details.getRoles()));
        return accountDetailsDTO;
    }

    @Override
    public List<DAccountDTO> list(DAccountQuery query) {
        TUserQuery buildQuery = accountBuilder.buildQuery(query);
        List<TUserDTO> queryList = userRepository.queryList(buildQuery);
        return accountBuilder.build(queryList);
    }

    @Override
    public List<DAccountDTO> top(DAccountQuery query) {
        TUserQuery buildQuery = accountBuilder.buildQuery(query);
        List<TUserDTO> queryList = userRepository.queryTop(buildQuery);
        return accountBuilder.build(queryList);
    }

    @Override
    public DAccountDTO first(DAccountQuery query) {
        TUserQuery buildQuery = accountBuilder.buildQuery(query);
        TUserDTO dto = userRepository.queryFirst(buildQuery);
        return accountBuilder.build(dto);
    }

    @Override
    public DAccountDTO one(DAccountQuery query) {
        TUserQuery buildQuery = accountBuilder.buildQuery(query);
        TUserDTO dto = userRepository.queryOne(buildQuery);
        return accountBuilder.build(dto);
    }

    @Override
    public IPageData<DAccountDTO> page(DAccountQuery query) {
        TUserQuery buildQuery = accountBuilder.buildQuery(query);
        IPageData<TUserDTO> dto = userRepository.queryPage(buildQuery);
        return accountBuilder.build(dto);
    }
}