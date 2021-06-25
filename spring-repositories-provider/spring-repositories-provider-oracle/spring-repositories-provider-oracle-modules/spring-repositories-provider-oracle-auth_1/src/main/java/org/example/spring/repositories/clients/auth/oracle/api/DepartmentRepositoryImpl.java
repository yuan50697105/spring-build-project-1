package org.example.spring.repositories.clients.auth.oracle.api;


import lombok.AllArgsConstructor;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.auth.api.DepartmentRepository;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentRoleDTO;
import org.example.spring.repositories.commons.entity.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.entity.auth.vo.DepartmentVo;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@AllArgsConstructor
@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository {
    private final org.example.spring.repositories.auth.oracle.repository.DepartmentRepository repository;

    @Override
    public void save(DepartmentVo vo) {
        repository.save(vo);
    }

    @Override
    public void save(DepartmentVo... vo) {
        repository.save(Arrays.asList(vo));
    }

    @Override
    public void save(List<DepartmentVo> vo) {
        repository.save(vo);
    }

    @Override
    public void update(DepartmentVo vo) {
        repository.update(vo);
    }

    @Override
    public void update(DepartmentVo... vo) {
        repository.update(Arrays.asList(vo));
    }

    @Override
    public void update(List<DepartmentVo> vo) {
        repository.update(vo);
    }

    @Override
    public void update(DepartmentVo vo, DepartmentQuery departmentQuery) {
        repository.update(vo, departmentQuery);
    }

    @Override
    public void updateNull(DepartmentVo vo) {
        repository.updateNull(vo);
    }

    @Override
    public void updateNull(DepartmentVo vo, DepartmentQuery departmentQuery) {
        repository.updateNull(vo, departmentQuery);
    }

    @Override
    public void updateNull(DepartmentVo... vo) {
        repository.updateNull(Arrays.asList(vo));
    }

    @Override
    public void updateNull(List<DepartmentVo> vo) {
        repository.updateNull(vo);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

    @Override
    public void delete(Long... ids) {
        repository.delete(ids);
    }

    @Override
    public void delete(List<Long> ids) {
        repository.delete(ids);
    }

    @Override
    public DepartmentDTO get(Long id) {
        return repository.get(id);
    }

    @Override
    public Optional<DepartmentDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<DepartmentDTO> listByIds(Long... ids) {
        return repository.listByIds(ids);
    }

    @Override
    public List<DepartmentDTO> listByIds(List<Long> ids) {
        return repository.listByIds(ids);
    }

    @Override
    public Stream<DepartmentDTO> streamByIds(Long... ids) {
        return listByIds(ids).stream();
    }

    @Override
    public Stream<DepartmentDTO> streamByIds(List<Long> ids) {
        return listByIds(ids).stream();
    }

    @Override
    public DepartmentDTO one(DepartmentQuery query) {
        return repository.queryOne(query);
    }

    @Override
    public Optional<DepartmentDTO> oneOpt(DepartmentQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public DepartmentDTO first(DepartmentQuery query) {
        return repository.queryFirst(query);
    }

    @Override
    public Optional<DepartmentDTO> firstOpt(DepartmentQuery query) {
        return Optional.of(first(query));
    }

    @Override
    public List<DepartmentDTO> list(DepartmentQuery query) {
        return repository.queryList(query);
    }

    @Override
    public Stream<DepartmentDTO> listStream(DepartmentQuery query) {
        return repository.queryStream(query);
    }

    @Override
    public List<DepartmentDTO> top(DepartmentQuery query) {
        return repository.queryTop(query);
    }

    @Override
    public Stream<DepartmentDTO> topStream(DepartmentQuery query) {
        return repository.queryTopStream(query);
    }

    @Override
    public IPageData<DepartmentDTO> data(DepartmentQuery query) {
        return repository.queryPage(query);
    }

    @Override
    public DepartmentRoleDTO getDepartmentRole(Long id) {
        return repository.getDetails(id);
    }

    @Override
    public Optional<DepartmentRoleDTO> getDepartmentRoleOpt(Long id) {
        return Optional.ofNullable(getDepartmentRole(id));
    }
}