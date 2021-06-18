package org.example.spring.repositories.clients.customer.oracle.api;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.customer.oracle.converter.CustomerInfoRepositoryConverter;
import org.example.spring.repositories.clients.customer.api.CustomerInfoRepository;
import org.example.spring.repositories.commons.entity.customer.dto.CustomerInfoDTO;
import org.example.spring.repositories.commons.entity.customer.query.CustomerInfoQuery;
import org.example.spring.repositories.commons.entity.customer.vo.CustomerInfoVo;
import org.example.spring.repositories.oracle.customer.repository.TCustomerInfoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public class CustomerInfoRepositoryImpl implements CustomerInfoRepository {
    private final TCustomerInfoRepository repository;
    private final CustomerInfoRepositoryConverter converter;

    public CustomerInfoRepositoryImpl(TCustomerInfoRepository repository, CustomerInfoRepositoryConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    @Override
    public void save(CustomerInfoVo vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void save(CustomerInfoVo... vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void save(List<CustomerInfoVo> vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void update(CustomerInfoVo vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(CustomerInfoVo... vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(List<CustomerInfoVo> vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(CustomerInfoVo vo, CustomerInfoQuery CustomerInfoQuery) {
        repository.update(converter.convertVo(vo), converter.convertQuery(CustomerInfoQuery));
    }

    @Override
    public void updateNull(CustomerInfoVo vo) {
        repository.updateNull(converter.convertVo(vo));
    }

    @Override
    public void updateNull(CustomerInfoVo vo, CustomerInfoQuery CustomerInfoQuery) {
        repository.updateNull(converter.convertVo(vo), converter.convertQuery(CustomerInfoQuery));
    }

    @Override
    public void updateNull(CustomerInfoVo... vo) {
        repository.updateNull(converter.convertVo(vo));
    }

    @Override
    public void updateNull(List<CustomerInfoVo> vo) {
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
    public CustomerInfoDTO get(Long id) {
        return converter.buildDto(repository.get(id));
    }

    @Override
    public Optional<CustomerInfoDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<CustomerInfoDTO> listByIds(Long... ids) {
        return converter.buildDto(repository.listByIds(ids));
    }

    @Override
    public List<CustomerInfoDTO> listByIds(List<Long> ids) {
        return converter.buildDto(repository.listByIds(ids));
    }

    @Override
    public Stream<CustomerInfoDTO> streamByIds(Long... ids) {
        return listByIds(ids).stream();
    }

    @Override
    public Stream<CustomerInfoDTO> streamByIds(List<Long> ids) {
        return listByIds(ids).stream();
    }

    @Override
    public CustomerInfoDTO one(CustomerInfoQuery query) {
        return converter.buildDto(repository.queryOne(converter.convertQuery(query)));
    }

    @Override
    public Optional<CustomerInfoDTO> oneOpt(CustomerInfoQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public CustomerInfoDTO first(CustomerInfoQuery query) {
        return converter.buildDto(repository.queryFirst(converter.convertQuery(query)));
    }

    @Override
    public Optional<CustomerInfoDTO> firstOpt(CustomerInfoQuery query) {
        return Optional.ofNullable(first(query));
    }

    @Override
    public List<CustomerInfoDTO> list(CustomerInfoQuery query) {
        return converter.buildDto(repository.queryList(converter.convertQuery(query)));
    }

    @Override
    public Stream<CustomerInfoDTO> listStream(CustomerInfoQuery query) {
        return list(query).stream();
    }

    @Override
    public List<CustomerInfoDTO> top(CustomerInfoQuery query) {
        return converter.buildDto(repository.queryTop(converter.convertQuery(query)));
    }

    @Override
    public Stream<CustomerInfoDTO> topStream(CustomerInfoQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<CustomerInfoDTO> data(CustomerInfoQuery query) {
        return converter.buildDto(repository.queryPage(converter.convertQuery(query)));
    }
}