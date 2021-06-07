package org.example.spring.repositories.clients.feign.mysql.auth;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.auth.api.DepartmentRepository;
import org.example.spring.repositories.clients.auth.mysql.api.DepartmentRepositoryImpl;
import org.example.spring.repositories.clients.auth.mysql.converter.DepartmentRepositoryConverter;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.entity.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.entity.auth.vo.DepartmentVo;
import org.example.spring.repositories.feign.auth.clients.DepartmentRepositoryClient;
import org.example.spring.repositories.mysql.auth.repository.TDepartmentRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
@Primary
public class DepartmentRepositoryController implements DepartmentRepositoryClient {
    private final DepartmentRepository departmentRepository;

    public DepartmentRepositoryController(DepartmentRepositoryConverter converter, TDepartmentRepository repository) {
        this.departmentRepository = new DepartmentRepositoryImpl(converter, repository);
    }

    @Override
    public void save(DepartmentVo vo) {
        departmentRepository.save(vo);
    }

    @Override
    public void update(DepartmentVo vo) {
        departmentRepository.update(vo);
    }

    @Override
    public void delete(Long id) {
        departmentRepository.delete(id);
    }

    @Override
    public void delete(Long... ids) {
        departmentRepository.delete(ids);
    }

    @Override
    public void delete(List<Long> ids) {
        departmentRepository.delete(ids);
    }

    @Override
    public DepartmentDTO get(Long id) {
        return departmentRepository.get(id);
    }

    @Override
    public Optional<DepartmentDTO> getOpt(Long id) {
        return departmentRepository.getOpt(id);
    }

    @Override
    public DepartmentDTO one(DepartmentQuery query) {
        return departmentRepository.one(query);
    }

    @Override
    public Optional<DepartmentDTO> oneOpt(DepartmentQuery query) {
        return departmentRepository.oneOpt(query);
    }

    @Override
    public DepartmentDTO first(DepartmentQuery query) {
        return departmentRepository.first(query);
    }

    @Override
    public Optional<DepartmentDTO> firstOpt(DepartmentQuery query) {
        return departmentRepository.firstOpt(query);
    }

    @Override
    public List<DepartmentDTO> list(DepartmentQuery query) {
        return departmentRepository.list(query);
    }

    @Override
    public Stream<DepartmentDTO> listStream(DepartmentQuery query) {
        return departmentRepository.listStream(query);
    }

    @Override
    public List<DepartmentDTO> top(DepartmentQuery query) {
        return departmentRepository.top(query);
    }

    @Override
    public Stream<DepartmentDTO> topStream(DepartmentQuery query) {
        return departmentRepository.topStream(query);
    }

    @Override
    public IPageData<DepartmentDTO> data(DepartmentQuery query) {
        return departmentRepository.data(query);
    }
}