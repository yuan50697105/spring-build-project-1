package org.example.spring.domains.daos.clients;


import io.seata.spring.annotation.GlobalTransactional;
import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.damains.daos.clients.auth.api.DUserDaoClients;
import org.example.spring.daos.clients.auth.api.UserDaoClients;
import org.example.spring.daos.clients.auth.entity.CUserDto;
import org.example.spring.daos.clients.auth.entity.CUserQuery;
import org.example.spring.daos.clients.auth.entity.CUserRoleDto;
import org.example.spring.daos.clients.auth.entity.CUserVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@AllArgsConstructor
@DubboService(interfaceClass = DUserDaoClients.class)
@RestController
@Primary
@GlobalTransactional
public class DUserClientImpl implements DUserDaoClients {
    private final UserDaoClients userDaoClients;

    @Override
    public CUserVo save(CUserVo vo) {
        return userDaoClients.save(vo);
    }

    @Override
    public void update(CUserVo vo) {
        userDaoClients.update(vo);
    }

    @Override
    public void delete(Long id) {
        userDaoClients.delete(id);
    }

    @Override
    public void delete(List<Long> ids) {
        userDaoClients.delete(ids);
    }

    @Override
    public CUserDto get(Long id) {
        return userDaoClients.get(id);
    }

    @Override
    public Optional<CUserDto> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public CUserRoleDto getWithRole(Long id) {
        return userDaoClients.getWithRole(id);
    }

    @Override
    public CUserDto one(CUserQuery query) {
        return userDaoClients.one(query);
    }

    @Override
    public Optional<CUserDto> oneOpt(CUserQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public CUserDto first(CUserQuery query) {
        return userDaoClients.first(query);
    }

    @Override
    public Optional<CUserDto> firstOpt(CUserQuery query) {
        return Optional.ofNullable(first(query));
    }

    @Override
    public Optional<CUserRoleDto> getWithRoleOpt(Long id) {
        return Optional.ofNullable(getWithRole(id));
    }

    @Override
    public List<CUserDto> list(CUserQuery query) {
        return userDaoClients.list(query);
    }

    @Override
    public Stream<CUserDto> listStream(CUserQuery query) {
        return userDaoClients.listStream(query);
    }

    @Override
    public List<CUserDto> top(CUserQuery query) {
        return userDaoClients.top(query);
    }

    @Override
    public Stream<CUserDto> topStream(CUserQuery query) {
        return userDaoClients.topStream(query);
    }

    @Override
    public IPageData<CUserDto> data(CUserQuery query) {
        return userDaoClients.data(query);
    }
}