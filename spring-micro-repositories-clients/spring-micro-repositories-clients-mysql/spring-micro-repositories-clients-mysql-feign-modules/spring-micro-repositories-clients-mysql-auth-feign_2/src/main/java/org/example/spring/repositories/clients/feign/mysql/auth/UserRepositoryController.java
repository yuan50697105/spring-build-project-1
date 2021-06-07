package org.example.spring.repositories.clients.feign.mysql.auth;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.auth.api.UserRepository;
import org.example.spring.repositories.clients.auth.mysql.api.UserRepositoryImpl;
import org.example.spring.repositories.clients.auth.mysql.converter.UserRepositoryConverter;
import org.example.spring.repositories.commons.entity.auth.dto.UserDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleDTO;
import org.example.spring.repositories.commons.entity.auth.dto.UserRoleResourceDTO;
import org.example.spring.repositories.commons.entity.auth.query.UserQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;
import org.example.spring.repositories.feign.auth.clients.UserRepositoryClient;
import org.example.spring.repositories.mysql.auth.repository.TUserRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
@Primary
public class UserRepositoryController implements UserRepositoryClient {
    private final UserRepository userRepository;

    public UserRepositoryController(TUserRepository repository, UserRepositoryConverter converter) {
        this.userRepository = new UserRepositoryImpl(repository, converter);
    }

    @Override
    public UserRoleDTO getWithRole(Long id) {
        return userRepository.getWithRole(id);
    }

    @Override
    public Optional<UserRoleDTO> getWithRoleOpt(Long id) {
        return userRepository.getWithRoleOpt(id);
    }

    @Override
    public UserRoleResourceDTO getWithRoleResource(Long id) {
        return userRepository.getWithRoleResource(id);
    }

    @Override
    public Optional<UserRoleResourceDTO> getWithRoleResourceOpt(Long id) {
        return userRepository.getWithRoleResourceOpt(id);
    }

    @Override
    public void save(UserVo vo) {
        userRepository.save(vo);
    }

    @Override
    public void update(UserVo vo) {
        userRepository.update(vo);
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
    public UserDTO get(Long id) {
        return userRepository.get(id);
    }

    @Override
    public Optional<UserDTO> getOpt(Long id) {
        return userRepository.getOpt(id);
    }

    @Override
    public UserDTO one(UserQuery query) {
        return userRepository.one(query);
    }

    @Override
    public Optional<UserDTO> oneOpt(UserQuery query) {
        return userRepository.oneOpt(query);
    }

    @Override
    public UserDTO first(UserQuery query) {
        return userRepository.first(query);
    }

    @Override
    public Optional<UserDTO> firstOpt(UserQuery query) {
        return userRepository.firstOpt(query);
    }

    @Override
    public List<UserDTO> list(UserQuery query) {
        return userRepository.list(query);
    }

    @Override
    public Stream<UserDTO> listStream(UserQuery query) {
        return userRepository.listStream(query);
    }

    @Override
    public List<UserDTO> top(UserQuery query) {
        return userRepository.top(query);
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