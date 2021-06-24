package org.example.spring.repositories.clients.customer.mysql.api;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.customer.api.SalesRecordRepository;
import org.example.spring.repositories.clients.customer.mysql.converter.SalesRecordRepositoryConverter;
import org.example.spring.repositories.commons.entity.customer.dto.SalesRecordDTO;
import org.example.spring.repositories.commons.entity.customer.query.SalesRecordQuery;
import org.example.spring.repositories.commons.entity.customer.vo.SalesRecordVo;
import org.example.spring.repositories.customer.mysql.repository.TSalesRecordRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public class SalesRecordRepositoryImpl implements SalesRecordRepository {
    private final TSalesRecordRepository repository;
    private final SalesRecordRepositoryConverter converter;

    public SalesRecordRepositoryImpl(TSalesRecordRepository repository, SalesRecordRepositoryConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    @Override
    public void save(SalesRecordVo vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void save(SalesRecordVo... vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void save(List<SalesRecordVo> vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void update(SalesRecordVo vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(SalesRecordVo... vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(List<SalesRecordVo> vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(SalesRecordVo vo, SalesRecordQuery SalesRecordQuery) {
        repository.update(converter.convertVo(vo), converter.convertQuery(SalesRecordQuery));
    }

    @Override
    public void updateNull(SalesRecordVo vo) {
        repository.updateNull(converter.convertVo(vo));
    }

    @Override
    public void updateNull(SalesRecordVo vo, SalesRecordQuery SalesRecordQuery) {
        repository.updateNull(converter.convertVo(vo), converter.convertQuery(SalesRecordQuery));
    }

    @Override
    public void updateNull(SalesRecordVo... vo) {
        repository.updateNull(converter.convertVo(vo));
    }

    @Override
    public void updateNull(List<SalesRecordVo> vo) {
        repository.updateNull(converter.convertVo(vo));
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
    public SalesRecordDTO get(Long id) {
        return converter.buildDto(repository.get(id));
    }

    @Override
    public Optional<SalesRecordDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<SalesRecordDTO> listByIds(Long... ids) {
        return converter.buildDto(repository.listByIds(ids));
    }

    @Override
    public List<SalesRecordDTO> listByIds(List<Long> ids) {
        return converter.buildDto(repository.listByIds(ids));
    }

    @Override
    public Stream<SalesRecordDTO> streamByIds(Long... ids) {
        return listByIds(ids).stream();
    }

    @Override
    public Stream<SalesRecordDTO> streamByIds(List<Long> ids) {
        return listByIds(ids).stream();
    }

    @Override
    public SalesRecordDTO one(SalesRecordQuery query) {
        return converter.buildDto(repository.queryOne(converter.convertQuery(query)));
    }

    @Override
    public Optional<SalesRecordDTO> oneOpt(SalesRecordQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public SalesRecordDTO first(SalesRecordQuery query) {
        return converter.buildDto(repository.queryFirst(converter.convertQuery(query)));
    }

    @Override
    public Optional<SalesRecordDTO> firstOpt(SalesRecordQuery query) {
        return Optional.ofNullable(first(query));
    }

    @Override
    public List<SalesRecordDTO> list(SalesRecordQuery query) {
        return converter.buildDto(repository.queryList(converter.convertQuery(query)));
    }

    @Override
    public Stream<SalesRecordDTO> listStream(SalesRecordQuery query) {
        return list(query).stream();
    }

    @Override
    public List<SalesRecordDTO> top(SalesRecordQuery query) {
        return converter.buildDto(repository.queryTop(converter.convertQuery(query)));
    }

    @Override
    public Stream<SalesRecordDTO> topStream(SalesRecordQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<SalesRecordDTO> data(SalesRecordQuery query) {
        return converter.buildDto(repository.queryPage(converter.convertQuery(query)));
    }
}