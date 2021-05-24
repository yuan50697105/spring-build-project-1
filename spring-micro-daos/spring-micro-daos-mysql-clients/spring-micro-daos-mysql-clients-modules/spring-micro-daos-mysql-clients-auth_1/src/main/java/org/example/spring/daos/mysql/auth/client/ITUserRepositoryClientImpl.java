package org.example.spring.daos.mysql.auth.client;

import io.seata.spring.annotation.GlobalTransactional;
import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.daos.mysql.auth.converter.TUserClientConverter;
import org.example.spring.daos.mysql.auth.dao.TUserDao;
import org.example.spring.daos.mysql.auth.entity.dto.UserDTO;
import org.example.spring.daos.mysql.auth.entity.dto.UserRoleDTO;
import org.example.spring.daos.mysql.auth.entity.query.UserQuery;
import org.example.spring.daos.mysql.auth.entity.vo.UserVo;
import org.example.spring.daos.mysql.auth.repository.TUserRepository;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
@DubboService
@AllArgsConstructor
public class ITUserRepositoryClientImpl implements IUserRepositoryClient {
    private final TUserDao userDao;
    private final TUserRepository userRepository;
    private final TUserClientConverter converter;

    @Override
    @GlobalTransactional
    public void save(UserVo user) {
        userRepository.save(converter.build(user));

    }

    @Override
    @GlobalTransactional
    public void updateStatusByIds(String status, List<Long> ids) {
        userDao.updateStatusByIds(status, ids);
    }

    @Override
    @GlobalTransactional
    public void update(UserVo user) {
        userRepository.update(converter.build(user));
    }

    @Override
    @GlobalTransactional
    public void delete(List<Long> ids) {
        userRepository.delete(ids);
    }

    @Override
    public UserDTO get(Long id) {
        return converter.build(userRepository.get(id));
    }


    @Override
    public Optional<UserDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public UserRoleDTO getDetails(Long id) {
        return converter.buildDetails(userRepository.getWithRole(id));
    }

    @Override
    public Optional<UserRoleDTO> getDetailsOpt(Long id) {
        return Optional.ofNullable(getDetails(id));
    }

    @Override
    public UserDTO queryOneByQuery(UserQuery query) {
        return converter.build(userRepository.queryOne(converter.build(query)));
    }

    @Override
    public Optional<UserDTO> queryOneByQueryOpt(UserQuery query) {
        return Optional.ofNullable(queryOneByQuery(query));
    }

    @Override
    public UserDTO queryFirstByQuery(UserQuery query) {
        return converter.build(userRepository.queryFirst(converter.build(query)));
    }

    @Override
    public Optional<UserDTO> queryFirstByQueryOpt(UserQuery query) {
        return Optional.ofNullable(queryFirstByQuery(query));
    }

    @Override
    public List<UserDTO> queryListByQuery(UserQuery query) {
        return converter.build(userRepository.queryList(converter.build(query)));
    }

    @Override
    public List<UserDTO> queryTopByQuery(UserQuery query) {
        return converter.build(userRepository.queryTop(converter.build(query)));
    }

    @Override
    public Stream<UserDTO> queryListStreamByQuery(UserQuery query) {
        return queryListByQuery(query).stream();
    }

    @Override
    public Stream<UserDTO> queryTopStreamByQuery(UserQuery query) {
        return queryTopByQuery(query).stream();
    }

    @Override
    public IPageData<UserDTO> queryPageByQuery(UserQuery query) {
        return converter.build(userRepository.queryPage(converter.build(query)));
    }
}