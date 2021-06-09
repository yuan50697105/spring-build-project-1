package org.example.spring.repositories.clients.auth.oracle.api;


import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.auth.api.DepartmentRepository;
import org.example.spring.repositories.clients.auth.oracle.converter.DepartmentRepositoryConverter;
import org.example.spring.repositories.commons.entity.auth.dto.DepartmentDTO;
import org.example.spring.repositories.commons.entity.auth.query.DepartmentQuery;
import org.example.spring.repositories.commons.entity.auth.vo.DepartmentVo;
import org.example.spring.repositories.oracle.auth.repository.TDepartmentRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


@Repository
public  class DepartmentRepositoryImpl implements DepartmentRepository {
    private final DepartmentRepositoryConverter converter;
    private final TDepartmentRepository repository;

    public DepartmentRepositoryImpl(DepartmentRepositoryConverter converter, TDepartmentRepository repository) {
        this.converter = converter;
        this.repository = repository;
    }

    @Override
    public void save(DepartmentVo vo) {
        repository.save(converter.build(vo));
    }

    @Override
    public void update(DepartmentVo vo) {
        repository.update(converter.build(vo));
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