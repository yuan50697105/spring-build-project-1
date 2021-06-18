package org.example.spring.repositories.clients.auth.mysql.api;


import lombok.AllArgsConstructor;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.auth.api.DepartmentRepository;
import org.example.spring.repositories.clients.auth.mysql.converter.DepartmentRepositoryConverter;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.entity.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.entity.auth.vo.DepartmentVo;
import org.example.spring.repositories.mysql.auth.repository.TDepartmentRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@AllArgsConstructor
@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository {
    private final DepartmentRepositoryConverter converter;
    private final TDepartmentRepository repository;

    @Override
    public void save(DepartmentVo vo) {
        repository.save(converter.buildVo(vo));
    }

    @Override
    public void save(DepartmentVo... vo) {
        repository.save(converter.buildVo(Arrays.asList(vo)));
    }

    @Override
    public void save(List<DepartmentVo> vo) {
        repository.save(converter.buildVo(vo));
    }

    @Override
    public void update(DepartmentVo vo) {
        repository.update(converter.buildVo(vo));
    }

    @Override
    public void update(DepartmentVo... vo) {
        repository.update(converter.buildVo(Arrays.asList(vo)));
    }

    @Override
    public void update(List<DepartmentVo> vo) {
        repository.update(converter.buildVo(vo));
    }

    @Override
    public void update(DepartmentVo vo, DepartmentQuery departmentQuery) {
        repository.update(converter.buildVo(vo), converter.build(departmentQuery));
    }

    @Override
    public void updateNull(DepartmentVo vo) {
        repository.updateNull(converter.buildVo(vo));
    }

    @Override
    public void updateNull(DepartmentVo vo, DepartmentQuery departmentQuery) {
        repository.updateNull(converter.buildVo(vo), converter.build(departmentQuery));
    }

    @Override
    public void updateNull(DepartmentVo... vo) {
        repository.updateNull(converter.buildVo(Arrays.asList(vo)));
    }

    @Override
    public void updateNull(List<DepartmentVo> vo) {
        repository.updateNull(converter.buildVo(vo));
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
        return converter.build(repository.get(id));
    }

    @Override
    public Optional<DepartmentDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<DepartmentDTO> listByIds(Long... ids) {
        return converter.build(repository.listByIds(ids));
    }

    @Override
    public List<DepartmentDTO> listByIds(List<Long> ids) {
        return converter.build(repository.listByIds(ids));
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
        return converter.build(repository.queryOne(converter.build(query)));
    }

    @Override
    public Optional<DepartmentDTO> oneOpt(DepartmentQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public DepartmentDTO first(DepartmentQuery query) {
        return converter.build(repository.queryFirst(converter.build(query)));
    }

    @Override
    public Optional<DepartmentDTO> firstOpt(DepartmentQuery query) {
        return Optional.of(first(query));
    }

    @Override
    public List<DepartmentDTO> list(DepartmentQuery query) {
        return converter.build(repository.queryList(converter.build(query)));
    }

    @Override
    public Stream<DepartmentDTO> listStream(DepartmentQuery query) {
        return converter.build(repository.queryStream(converter.build(query)));
    }

    @Override
    public List<DepartmentDTO> top(DepartmentQuery query) {
        return converter.build(repository.queryTop(converter.build(query)));
    }

    @Override
    public Stream<DepartmentDTO> topStream(DepartmentQuery query) {
        return converter.build(repository.queryTopStream(converter.build(query)));
    }

    @Override
    public IPageData<DepartmentDTO> data(DepartmentQuery query) {
        return converter.build(repository.queryPage(converter.build(query)));
    }
}