package org.example.spring.domains.daos.clients;


import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.damains.daos.clients.auth.api.DAccountDaoClients;
import org.example.spring.domains.repositories.mysql.auth.repository.DAccountRepository;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.auth.dto.UserDTO;
import org.example.spring.repositories.commons.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.auth.query.UserQuery;
import org.example.spring.repositories.commons.auth.vo.UserVo;
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
    public UserVo save(UserVo vo) {
        return null;
    }

    @Override
    public void update(UserVo vo) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void delete(List<Long> ids) {

    }

    @Override
    public UserDTO get(Long id) {
        return null;
    }

    @Override
    public Optional<UserDTO> getOpt(Long id) {
        return Optional.empty();
    }

    @Override
    public UserRoleDTO getWithRole(Long id) {
        return null;
    }

    @Override
    public UserDTO one(UserQuery query) {
        return null;
    }

    @Override
    public Optional<UserDTO> oneOpt(UserQuery query) {
        return Optional.empty();
    }

    @Override
    public UserDTO first(UserQuery query) {
        return null;
    }

    @Override
    public Optional<UserDTO> firstOpt(UserQuery query) {
        return Optional.empty();
    }

    @Override
    public Optional<UserRoleDTO> getWithRoleOpt(Long id) {
        return Optional.empty();
    }

    @Override
    public List<UserDTO> list(UserQuery query) {
        return null;
    }

    @Override
    public Stream<UserDTO> listStream(UserQuery query) {
        return null;
    }

    @Override
    public List<UserDTO> top(UserQuery query) {
        return null;
    }

    @Override
    public Stream<UserDTO> topStream(UserQuery query) {
        return null;
    }

    @Override
    public IPageData<UserDTO> data(UserQuery query) {
        return null;
    }
}