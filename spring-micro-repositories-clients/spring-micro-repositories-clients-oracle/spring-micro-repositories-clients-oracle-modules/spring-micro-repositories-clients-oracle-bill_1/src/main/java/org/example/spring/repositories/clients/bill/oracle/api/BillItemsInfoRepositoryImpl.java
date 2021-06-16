package org.example.spring.repositories.clients.bill.oracle.api;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.bill.api.BillItemsInfoRepository;
import org.example.spring.repositories.clients.bill.oracle.converter.BillItemsInfoRepositoryConverter;
import org.example.spring.repositories.commons.entity.bill.dto.BillItemsInfoDTO;
import org.example.spring.repositories.commons.entity.bill.query.BillItemsInfoQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillItemsInfoVo;
import org.example.spring.repositories.oracle.bill.repository.TBillItemsInfoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public class BillItemsInfoRepositoryImpl implements BillItemsInfoRepository {
    private final TBillItemsInfoRepository repository;
    private final BillItemsInfoRepositoryConverter converter;

    public BillItemsInfoRepositoryImpl(TBillItemsInfoRepository repository, BillItemsInfoRepositoryConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    @Override
    public void save(BillItemsInfoVo vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void save(BillItemsInfoVo... vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void save(List<BillItemsInfoVo> vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void update(BillItemsInfoVo vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(BillItemsInfoVo... vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(List<BillItemsInfoVo> vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(BillItemsInfoVo vo, BillItemsInfoQuery billItemsInfoQuery) {
        repository.update(converter.convertVo(vo), converter.convertQuery(billItemsInfoQuery));
    }

    @Override
    public void updateNull(BillItemsInfoVo vo) {
        repository.updateNull(converter.convertVo(vo));
    }

    @Override
    public void updateNull(BillItemsInfoVo vo, BillItemsInfoQuery billItemsInfoQuery) {
        repository.updateNull(converter.convertVo(vo), converter.convertQuery(billItemsInfoQuery));
    }

    @Override
    public void updateNull(BillItemsInfoVo... vo) {
        repository.updateNull(converter.convertVo(vo));
    }

    @Override
    public void updateNull(List<BillItemsInfoVo> vo) {
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
    public BillItemsInfoDTO get(Long id) {
        return converter.buildDto(repository.get(id));
    }

    @Override
    public Optional<BillItemsInfoDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<BillItemsInfoDTO> listByIds(Long... ids) {
        return converter.buildDto(repository.listByIds(ids));
    }

    @Override
    public List<BillItemsInfoDTO> listByIds(List<Long> ids) {
        return converter.buildDto(repository.listByIds(ids));
    }

    @Override
    public Stream<BillItemsInfoDTO> streamByIds(Long... ids) {
        return listByIds(ids).stream();
    }

    @Override
    public Stream<BillItemsInfoDTO> streamByIds(List<Long> ids) {
        return listByIds(ids).stream();
    }

    @Override
    public BillItemsInfoDTO one(BillItemsInfoQuery query) {
        return converter.buildDto(repository.queryOne(converter.convertQuery(query)));
    }

    @Override
    public Optional<BillItemsInfoDTO> oneOpt(BillItemsInfoQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public BillItemsInfoDTO first(BillItemsInfoQuery query) {
        return converter.buildDto(repository.queryFirst(converter.convertQuery(query)));
    }

    @Override
    public Optional<BillItemsInfoDTO> firstOpt(BillItemsInfoQuery query) {
        return Optional.ofNullable(first(query));
    }

    @Override
    public List<BillItemsInfoDTO> list(BillItemsInfoQuery query) {
        return converter.buildDto(repository.queryList(converter.convertQuery(query)));
    }

    @Override
    public Stream<BillItemsInfoDTO> listStream(BillItemsInfoQuery query) {
        return list(query).stream();
    }

    @Override
    public List<BillItemsInfoDTO> top(BillItemsInfoQuery query) {
        return converter.buildDto(repository.queryTop(converter.convertQuery(query)));
    }

    @Override
    public Stream<BillItemsInfoDTO> topStream(BillItemsInfoQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<BillItemsInfoDTO> data(BillItemsInfoQuery query) {
        return converter.buildDto(repository.queryPage(converter.convertQuery(query)));
    }
}