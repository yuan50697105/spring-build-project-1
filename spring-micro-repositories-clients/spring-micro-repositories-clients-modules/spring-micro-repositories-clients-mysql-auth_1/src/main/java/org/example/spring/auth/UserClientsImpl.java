package org.example.spring.auth;

import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.auth.converter.UserClientsConverter;
import org.example.spring.daos.clients.auth.api.UserDaoClients;
import org.example.spring.daos.clients.auth.entity.*;
import org.example.spring.daos.mysql.auth.repository.TUserRepository;
import org.example.spring.daos.mysql.auth.table.dto.TUserDTO;
import org.example.spring.daos.mysql.auth.table.query.TUserQuery;
import org.example.spring.daos.mysql.auth.table.vo.TUserVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
@DubboService
@GlobalTransactional
public class UserClientsImpl implements UserDaoClients {

    private final TUserRepository userRepository;
    private final UserClientsConverter userClientsConverter;

    public UserClientsImpl(TUserRepository userRepository, UserClientsConverter userClientsConverter) {
        this.userRepository = userRepository;
        this.userClientsConverter = userClientsConverter;
    }

    @Override
    public CUserVo save(CUserVo vo) {
        TUserVo build = userClientsConverter.build(vo);
        userRepository.save(build);

        return userClientsConverter.convert(build);
    }

    @Override
    public void update(CUserVo vo) {
        userRepository.update(userClientsConverter.build(vo));
    }

    @Override
    public void delete(Long id) {
        userRepository.delete(id);
    }

    @Override
    public void delete(List<Long> ids) {
        userRepository.delete(ids);
    }

    @Override
    public CUserDto get(Long id) {
        return userClientsConverter.build(userRepository.get(id));
    }

    @Override
    public Optional<CUserDto> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public CUserRoleDto getWithRole(Long id) {
        return userClientsConverter.buildWithRole(userRepository.getWithRole(id));
    }

    @Override
    public CUserDto one(CUserQuery query) {
        TUserQuery userQuery = userClientsConverter.build(query);
        TUserDTO dto = userRepository.queryOne(userQuery);
        return userClientsConverter.build(dto);
    }

    @Override
    public Optional<CUserDto> oneOpt(CUserQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public CUserDto first(CUserQuery query) {
        TUserQuery userQuery = userClientsConverter.build(query);
        TUserDTO dto = userRepository.queryFirst(userQuery);
        return userClientsConverter.build(dto);
    }

    @Override
    public Optional<CUserDto> firstOpt(CUserQuery query) {
        return Optional.ofNullable(first(query));
    }

    @Override
    public Optional<CUserRoleDto> getWithRoleOpt(Long id) {
        return Optional.of(getWithRole(id));
    }

    @Override
    public List<CUserDto> list(CUserQuery query) {
        TUserQuery userQuery = userClientsConverter.build(query);
        List<TUserDTO> dto = userRepository.queryList(userQuery);
        return userClientsConverter.build(dto);
    }

    @Override
    public Stream<CUserDto> listStream(CUserQuery query) {
        return list(query).stream();
    }

    @Override
    public List<CUserDto> top(CUserQuery query) {
        TUserQuery userQuery = userClientsConverter.build(query);
        List<TUserDTO> dto = userRepository.queryTop(userQuery);
        return userClientsConverter.build(dto);
    }

    @Override
    public Stream<CUserDto> topStream(CUserQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<CUserDto> data(CUserQuery query) {
        TUserQuery userQuery = userClientsConverter.build(query);
        IPageData<TUserDTO> dto = userRepository.queryPage(userQuery);
        return userClientsConverter.build(dto);
    }
}