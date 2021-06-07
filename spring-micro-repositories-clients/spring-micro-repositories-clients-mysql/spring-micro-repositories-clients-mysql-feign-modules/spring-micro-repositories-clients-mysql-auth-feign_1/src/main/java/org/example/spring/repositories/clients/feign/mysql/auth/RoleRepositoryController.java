package org.example.spring.repositories.clients.feign.mysql.auth;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.auth.api.RoleRepository;
import org.example.spring.repositories.clients.auth.mysql.api.RoleRepositoryImpl;
import org.example.spring.repositories.clients.auth.mysql.converter.RoleRepositoryConverter;
import org.example.spring.repositories.commons.entity.auth.dto.RoleDTO;
import org.example.spring.repositories.commons.entity.auth.query.RoleQuery;
import org.example.spring.repositories.commons.entity.auth.vo.RoleVo;
import org.example.spring.repositories.feign.auth.clients.RoleRepositoryClient;
import org.example.spring.repositories.mysql.auth.repository.TRoleRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
@Primary
public class RoleRepositoryController implements RoleRepositoryClient {
    private final RoleRepository roleRepository;

    public RoleRepositoryController(RoleRepositoryConverter converter, TRoleRepository repository) {
        this.roleRepository = new RoleRepositoryImpl(converter, repository);
    }

    @Override
    public void save(RoleVo vo) {
        roleRepository.save(vo);
    }

    @Override
    public void update(RoleVo vo) {
        roleRepository.update(vo);
    }

    @Override
    public void delete(Long id) {
        roleRepository.delete(id);
    }

    @Override
    public void delete(Long... ids) {
        roleRepository.delete(ids);
    }

    @Override
    public void delete(List<Long> ids) {
        roleRepository.delete(ids);
    }

    @Override
    public RoleDTO get(Long id) {
        return roleRepository.get(id);
    }

    @Override
    public Optional<RoleDTO> getOpt(Long id) {
        return roleRepository.getOpt(id);
    }

    @Override
    public RoleDTO one(RoleQuery query) {
        return roleRepository.one(query);
    }

    @Override
    public Optional<RoleDTO> oneOpt(RoleQuery query) {
        return roleRepository.oneOpt(query);
    }

    @Override
    public RoleDTO first(RoleQuery query) {
        return roleRepository.first(query);
    }

    @Override
    public Optional<RoleDTO> firstOpt(RoleQuery query) {
        return roleRepository.firstOpt(query);
    }

    @Override
    public List<RoleDTO> list(RoleQuery query) {
        return roleRepository.list(query);
    }

    @Override
    public Stream<RoleDTO> listStream(RoleQuery query) {
        return roleRepository.listStream(query);
    }

    @Override
    public List<RoleDTO> top(RoleQuery query) {
        return roleRepository.top(query);
    }

    @Override
    public Stream<RoleDTO> topStream(RoleQuery query) {
        return roleRepository.topStream(query);
    }

    @Override
    public IPageData<RoleDTO> data(RoleQuery query) {
        return roleRepository.data(query);
    }
}