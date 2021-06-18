package org.example.spring.repositories.clients.customer.mssql.api;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.customer.mssql.converter.SellerInfoRepositoryConverter;
import org.example.spring.repositories.clients.customer.api.SellerInfoRepository;
import org.example.spring.repositories.commons.entity.customer.dto.SellerInfoDTO;
import org.example.spring.repositories.commons.entity.customer.query.SellerInfoQuery;
import org.example.spring.repositories.commons.entity.customer.vo.SellerInfoVo;
import org.example.spring.repositories.mssql.customer.repository.TSellerInfoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public class SellerInfoRepositoryImpl implements SellerInfoRepository {
    private final TSellerInfoRepository repository;
    private final SellerInfoRepositoryConverter converter;

    public SellerInfoRepositoryImpl(TSellerInfoRepository repository, SellerInfoRepositoryConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    @Override
    public void save(SellerInfoVo vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void save(SellerInfoVo... vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void save(List<SellerInfoVo> vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void update(SellerInfoVo vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(SellerInfoVo... vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(List<SellerInfoVo> vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(SellerInfoVo vo, SellerInfoQuery SellerInfoQuery) {
        repository.update(converter.convertVo(vo), converter.convertQuery(SellerInfoQuery));
    }

    @Override
    public void updateNull(SellerInfoVo vo) {
        repository.updateNull(converter.convertVo(vo));
    }

    @Override
    public void updateNull(SellerInfoVo vo, SellerInfoQuery SellerInfoQuery) {
        repository.updateNull(converter.convertVo(vo), converter.convertQuery(SellerInfoQuery));
    }

    @Override
    public void updateNull(SellerInfoVo... vo) {
        repository.updateNull(converter.convertVo(vo));
    }

    @Override
    public void updateNull(List<SellerInfoVo> vo) {
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
    public SellerInfoDTO get(Long id) {
        return converter.buildDto(repository.get(id));
    }

    @Override
    public Optional<SellerInfoDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<SellerInfoDTO> listByIds(Long... ids) {
        return converter.buildDto(repository.listByIds(ids));
    }

    @Override
    public List<SellerInfoDTO> listByIds(List<Long> ids) {
        return converter.buildDto(repository.listByIds(ids));
    }

    @Override
    public Stream<SellerInfoDTO> streamByIds(Long... ids) {
        return listByIds(ids).stream();
    }

    @Override
    public Stream<SellerInfoDTO> streamByIds(List<Long> ids) {
        return listByIds(ids).stream();
    }

    @Override
    public SellerInfoDTO one(SellerInfoQuery query) {
        return converter.buildDto(repository.queryOne(converter.convertQuery(query)));
    }

    @Override
    public Optional<SellerInfoDTO> oneOpt(SellerInfoQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public SellerInfoDTO first(SellerInfoQuery query) {
        return converter.buildDto(repository.queryFirst(converter.convertQuery(query)));
    }

    @Override
    public Optional<SellerInfoDTO> firstOpt(SellerInfoQuery query) {
        return Optional.ofNullable(first(query));
    }

    @Override
    public List<SellerInfoDTO> list(SellerInfoQuery query) {
        return converter.buildDto(repository.queryList(converter.convertQuery(query)));
    }

    @Override
    public Stream<SellerInfoDTO> listStream(SellerInfoQuery query) {
        return list(query).stream();
    }

    @Override
    public List<SellerInfoDTO> top(SellerInfoQuery query) {
        return converter.buildDto(repository.queryTop(converter.convertQuery(query)));
    }

    @Override
    public Stream<SellerInfoDTO> topStream(SellerInfoQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<SellerInfoDTO> data(SellerInfoQuery query) {
        return converter.buildDto(repository.queryPage(converter.convertQuery(query)));
    }
}