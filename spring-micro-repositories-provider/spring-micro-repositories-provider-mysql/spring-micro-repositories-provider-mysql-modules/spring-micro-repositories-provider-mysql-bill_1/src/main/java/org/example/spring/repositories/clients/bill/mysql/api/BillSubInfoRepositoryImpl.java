package org.example.spring.repositories.clients.bill.mysql.api;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.bill.mysql.repository.TBillSubInfoRepository;
import org.example.spring.repositories.clients.bill.api.BillSubInfoRepository;
import org.example.spring.repositories.clients.bill.mysql.converter.BillSubInfoRepositoryConverter;
import org.example.spring.repositories.commons.entity.bill.dto.BillSubInfoDTO;
import org.example.spring.repositories.commons.entity.bill.query.BillSubInfoQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillSubInfoVo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public class BillSubInfoRepositoryImpl implements BillSubInfoRepository {
    private final TBillSubInfoRepository repository;
    private final BillSubInfoRepositoryConverter converter;

    public BillSubInfoRepositoryImpl(TBillSubInfoRepository repository, BillSubInfoRepositoryConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    @Override
    public void save(BillSubInfoVo vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void save(BillSubInfoVo... vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void save(List<BillSubInfoVo> vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void update(BillSubInfoVo vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(BillSubInfoVo... vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(List<BillSubInfoVo> vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(BillSubInfoVo vo, BillSubInfoQuery billSubInfoQuery) {
        repository.update(converter.convertVo(vo), converter.convertQuery(billSubInfoQuery));
    }

    @Override
    public void updateNull(BillSubInfoVo vo) {
        repository.updateNull(converter.convertVo(vo));
    }

    @Override
    public void updateNull(BillSubInfoVo vo, BillSubInfoQuery billSubInfoQuery) {
        repository.updateNull(converter.convertVo(vo), converter.convertQuery(billSubInfoQuery));
    }

    @Override
    public void updateNull(BillSubInfoVo... vo) {
        repository.updateNull(converter.convertVo(vo));
    }

    @Override
    public void updateNull(List<BillSubInfoVo> vo) {
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
    public BillSubInfoDTO get(Long id) {
        return converter.buildDto(repository.get(id));
    }

    @Override
    public Optional<BillSubInfoDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<BillSubInfoDTO> listByIds(Long... ids) {
        return converter.buildDto(repository.listByIds(ids));
    }

    @Override
    public List<BillSubInfoDTO> listByIds(List<Long> ids) {
        return converter.buildDto(repository.listByIds(ids));
    }

    @Override
    public Stream<BillSubInfoDTO> streamByIds(Long... ids) {
        return listByIds(ids).stream();
    }

    @Override
    public Stream<BillSubInfoDTO> streamByIds(List<Long> ids) {
        return listByIds(ids).stream();
    }

    @Override
    public BillSubInfoDTO one(BillSubInfoQuery query) {
        return converter.buildDto(repository.queryOne(converter.convertQuery(query)));
    }

    @Override
    public Optional<BillSubInfoDTO> oneOpt(BillSubInfoQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public BillSubInfoDTO first(BillSubInfoQuery query) {
        return converter.buildDto(repository.queryFirst(converter.convertQuery(query)));
    }

    @Override
    public Optional<BillSubInfoDTO> firstOpt(BillSubInfoQuery query) {
        return Optional.ofNullable(first(query));
    }

    @Override
    public List<BillSubInfoDTO> list(BillSubInfoQuery query) {
        return converter.buildDto(repository.queryList(converter.convertQuery(query)));
    }

    @Override
    public Stream<BillSubInfoDTO> listStream(BillSubInfoQuery query) {
        return list(query).stream();
    }

    @Override
    public List<BillSubInfoDTO> top(BillSubInfoQuery query) {
        return converter.buildDto(repository.queryTop(converter.convertQuery(query)));
    }

    @Override
    public Stream<BillSubInfoDTO> topStream(BillSubInfoQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<BillSubInfoDTO> data(BillSubInfoQuery query) {
        return converter.buildDto(repository.queryPage(converter.convertQuery(query)));
    }
}