package org.example.spring.repositories.clients.bill.mysql.api;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.bill.api.BillInfoRepository;
import org.example.spring.repositories.clients.bill.mysql.converter.BillInfoRepositoryConverter;
import org.example.spring.repositories.commons.entity.bill.dto.BillInfoDTO;
import org.example.spring.repositories.commons.entity.bill.query.BillInfoQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillInfoVo;
import org.example.spring.repositories.mysql.bill.repository.TBillInfoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public class BillInfoRepositoryImpl implements BillInfoRepository {
    private final TBillInfoRepository repository;
    private final BillInfoRepositoryConverter converter;

    public BillInfoRepositoryImpl(TBillInfoRepository repository, BillInfoRepositoryConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    public void save(BillInfoVo vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void save(BillInfoVo... vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void save(List<BillInfoVo> vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void update(BillInfoVo vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(BillInfoVo... vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(List<BillInfoVo> vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(BillInfoVo vo, BillInfoQuery billInfoQuery) {
        repository.update(converter.convertVo(vo), converter.convertQuery(billInfoQuery));
    }

    @Override
    public void updateNull(BillInfoVo vo) {
        repository.updateNull(converter.convertVo(vo));
    }

    @Override
    public void updateNull(BillInfoVo vo, BillInfoQuery billInfoQuery) {
        repository.updateNull(converter.convertVo(vo), converter.convertQuery(billInfoQuery));
    }

    @Override
    public void updateNull(BillInfoVo... vo) {
        repository.updateNull(converter.convertVo(vo));
    }

    @Override
    public void updateNull(List<BillInfoVo> vo) {
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
    public BillInfoDTO get(Long id) {
        return converter.buildDTO(repository.get(id));
    }

    @Override
    public Optional<BillInfoDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<BillInfoDTO> listByIds(Long... ids) {
        return converter.buildDTO(repository.listByIds(ids));
    }

    @Override
    public List<BillInfoDTO> listByIds(List<Long> ids) {
        return converter.buildDTO(repository.listByIds(ids));
    }

    @Override
    public Stream<BillInfoDTO> streamByIds(Long... ids) {
        return listByIds(ids).stream();
    }

    @Override
    public Stream<BillInfoDTO> streamByIds(List<Long> ids) {
        return listByIds(ids).stream();
    }

    @Override
    public BillInfoDTO one(BillInfoQuery query) {
        return converter.buildDTO(repository.queryOne(converter.convertQuery(query)));
    }

    @Override
    public Optional<BillInfoDTO> oneOpt(BillInfoQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public BillInfoDTO first(BillInfoQuery query) {
        return converter.buildDTO(repository.queryFirst(converter.convertQuery(query)));
    }

    @Override
    public Optional<BillInfoDTO> firstOpt(BillInfoQuery query) {
        return Optional.ofNullable(first(query));
    }

    @Override
    public List<BillInfoDTO> list(BillInfoQuery query) {
        return converter.buildDTO(repository.queryList(converter.convertQuery(query)));
    }

    @Override
    public Stream<BillInfoDTO> listStream(BillInfoQuery query) {
        return list(query).stream();
    }

    @Override
    public List<BillInfoDTO> top(BillInfoQuery query) {
        return converter.buildDTO(repository.queryTop(converter.convertQuery(query)));
    }

    @Override
    public Stream<BillInfoDTO> topStream(BillInfoQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<BillInfoDTO> data(BillInfoQuery query) {
        return converter.buildDTO(repository.queryPage(converter.convertQuery(query)));
    }
}