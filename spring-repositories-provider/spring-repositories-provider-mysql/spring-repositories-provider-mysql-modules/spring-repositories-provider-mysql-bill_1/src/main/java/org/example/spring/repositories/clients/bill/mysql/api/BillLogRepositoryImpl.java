package org.example.spring.repositories.clients.bill.mysql.api;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.bill.mysql.repository.TBillLogRepository;
import org.example.spring.repositories.clients.bill.api.BillLogRepository;
import org.example.spring.repositories.clients.bill.mysql.converter.BillLogRepositoryConverter;
import org.example.spring.repositories.commons.entity.bill.dto.BillLogDTO;
import org.example.spring.repositories.commons.entity.bill.query.BillLogQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillLogVo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public class BillLogRepositoryImpl implements BillLogRepository {
    private final TBillLogRepository repository;
    private final BillLogRepositoryConverter converter;

    public BillLogRepositoryImpl(TBillLogRepository repository, BillLogRepositoryConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    @Override
    public void save(BillLogVo vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void save(BillLogVo... vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void save(List<BillLogVo> vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void update(BillLogVo vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(BillLogVo... vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(List<BillLogVo> vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(BillLogVo vo, BillLogQuery billLogQuery) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void updateNull(BillLogVo vo) {
        repository.updateNull(converter.convertVo(vo));
    }

    @Override
    public void updateNull(BillLogVo vo, BillLogQuery billLogQuery) {
        repository.updateNull(converter.convertVo(vo), converter.convertQuery(billLogQuery));
    }

    @Override
    public void updateNull(BillLogVo... vo) {
        repository.updateNull(converter.convertVo(vo));
    }

    @Override
    public void updateNull(List<BillLogVo> vo) {
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
    public BillLogDTO get(Long id) {
        return converter.buildDto(repository.get(id));
    }

    @Override
    public Optional<BillLogDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<BillLogDTO> listByIds(Long... ids) {
        return converter.buildDto(repository.listByIds(ids));
    }

    @Override
    public List<BillLogDTO> listByIds(List<Long> ids) {
        return converter.buildDto(repository.listByIds(ids));
    }

    @Override
    public Stream<BillLogDTO> streamByIds(Long... ids) {
        return listByIds(ids).stream();
    }

    @Override
    public Stream<BillLogDTO> streamByIds(List<Long> ids) {
        return listByIds(ids).stream();
    }

    @Override
    public BillLogDTO one(BillLogQuery query) {
        return converter.buildDto(repository.queryOne(converter.convertQuery(query)));
    }

    @Override
    public Optional<BillLogDTO> oneOpt(BillLogQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public BillLogDTO first(BillLogQuery query) {
        return converter.buildDto(repository.queryFirst(converter.convertQuery(query)));
    }

    @Override
    public Optional<BillLogDTO> firstOpt(BillLogQuery query) {
        return Optional.ofNullable(first(query));
    }

    @Override
    public List<BillLogDTO> list(BillLogQuery query) {
        return converter.buildDto(repository.queryList(converter.convertQuery(query)));
    }

    @Override
    public Stream<BillLogDTO> listStream(BillLogQuery query) {
        return list(query).stream();
    }

    @Override
    public List<BillLogDTO> top(BillLogQuery query) {
        return converter.buildDto(repository.queryTop(converter.convertQuery(query)));
    }

    @Override
    public Stream<BillLogDTO> topStream(BillLogQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<BillLogDTO> data(BillLogQuery query) {
        return converter.buildDto(repository.queryPage(converter.convertQuery(query)));
    }
}