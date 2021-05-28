package org.example.spring.domains.daos.clients;


import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.damains.daos.clients.auth.api.DAccountDaoClients;
import org.example.spring.daos.clients.auth.entity.CUserDto;
import org.example.spring.daos.clients.auth.entity.CUserQuery;
import org.example.spring.daos.clients.auth.entity.CUserRoleDto;
import org.example.spring.daos.clients.auth.entity.CUserVo;
import org.example.spring.domains.repositories.mysql.auth.repository.DAccountRepository;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@DubboService(interfaceClass = DAccountDaoClients.class)
@RestController
@Primary
@GlobalTransactional
public class DAccountDaoClientstImpl implements DAccountDaoClients {
    private DAccountRepository accountRepository;

    @Override
    public CUserVo save(CUserVo vo) {
        return null;
    }

    @Override
    public void update(CUserVo vo) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void delete(List<Long> ids) {

    }

    @Override
    public CUserDto get(Long id) {
        return null;
    }

    @Override
    public Optional<CUserDto> getOpt(Long id) {
        return Optional.empty();
    }

    @Override
    public CUserRoleDto getWithRole(Long id) {
        return null;
    }

    @Override
    public CUserDto one(CUserQuery query) {
        return null;
    }

    @Override
    public Optional<CUserDto> oneOpt(CUserQuery query) {
        return Optional.empty();
    }

    @Override
    public CUserDto first(CUserQuery query) {
        return null;
    }

    @Override
    public Optional<CUserDto> firstOpt(CUserQuery query) {
        return Optional.empty();
    }

    @Override
    public Optional<CUserRoleDto> getWithRoleOpt(Long id) {
        return Optional.empty();
    }

    @Override
    public List<CUserDto> list(CUserQuery query) {
        return null;
    }

    @Override
    public Stream<CUserDto> listStream(CUserQuery query) {
        return null;
    }

    @Override
    public List<CUserDto> top(CUserQuery query) {
        return null;
    }

    @Override
    public Stream<CUserDto> topStream(CUserQuery query) {
        return null;
    }

    @Override
    public IPageData<CUserDto> data(CUserQuery query) {
        return null;
    }
}