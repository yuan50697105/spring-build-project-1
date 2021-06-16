package org.example.spring.repositories.clients.customer.mssql.api;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.customer.mssql.converter.CustomerOrderRepositoryConverter;
import org.example.spring.repositories.clients.customer.api.CustomerOrderRepository;
import org.example.spring.repositories.commons.entity.customer.dto.CustomerOrderDTO;
import org.example.spring.repositories.commons.entity.customer.query.CustomerOrderQuery;
import org.example.spring.repositories.commons.entity.customer.vo.CustomerOrderVo;
import org.example.spring.repositories.mssql.customer.repository.TCustomerOrderRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public class CustomerOrderRepositoryImpl implements CustomerOrderRepository {
    private final TCustomerOrderRepository repository;
    private final CustomerOrderRepositoryConverter converter;

    public CustomerOrderRepositoryImpl(TCustomerOrderRepository repository, CustomerOrderRepositoryConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    @Override
    public void save(CustomerOrderVo vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void save(CustomerOrderVo... vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void save(List<CustomerOrderVo> vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void update(CustomerOrderVo vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(CustomerOrderVo... vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(List<CustomerOrderVo> vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(CustomerOrderVo vo, CustomerOrderQuery CustomerOrderQuery) {
        repository.update(converter.convertVo(vo), converter.convertQuery(CustomerOrderQuery));
    }

    @Override
    public void updateNull(CustomerOrderVo vo) {
        repository.updateNull(converter.convertVo(vo));
    }

    @Override
    public void updateNull(CustomerOrderVo vo, CustomerOrderQuery CustomerOrderQuery) {
        repository.updateNull(converter.convertVo(vo), converter.convertQuery(CustomerOrderQuery));
    }

    @Override
    public void updateNull(CustomerOrderVo... vo) {
        repository.updateNull(converter.convertVo(vo));
    }

    @Override
    public void updateNull(List<CustomerOrderVo> vo) {
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
    public CustomerOrderDTO get(Long id) {
        return converter.buildDto(repository.get(id));
    }

    @Override
    public Optional<CustomerOrderDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<CustomerOrderDTO> listByIds(Long... ids) {
        return converter.buildDto(repository.listByIds(ids));
    }

    @Override
    public List<CustomerOrderDTO> listByIds(List<Long> ids) {
        return converter.buildDto(repository.listByIds(ids));
    }

    @Override
    public Stream<CustomerOrderDTO> streamByIds(Long... ids) {
        return listByIds(ids).stream();
    }

    @Override
    public Stream<CustomerOrderDTO> streamByIds(List<Long> ids) {
        return listByIds(ids).stream();
    }

    @Override
    public CustomerOrderDTO one(CustomerOrderQuery query) {
        return converter.buildDto(repository.queryOne(converter.convertQuery(query)));
    }

    @Override
    public Optional<CustomerOrderDTO> oneOpt(CustomerOrderQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public CustomerOrderDTO first(CustomerOrderQuery query) {
        return converter.buildDto(repository.queryFirst(converter.convertQuery(query)));
    }

    @Override
    public Optional<CustomerOrderDTO> firstOpt(CustomerOrderQuery query) {
        return Optional.ofNullable(first(query));
    }

    @Override
    public List<CustomerOrderDTO> list(CustomerOrderQuery query) {
        return converter.buildDto(repository.queryList(converter.convertQuery(query)));
    }

    @Override
    public Stream<CustomerOrderDTO> listStream(CustomerOrderQuery query) {
        return list(query).stream();
    }

    @Override
    public List<CustomerOrderDTO> top(CustomerOrderQuery query) {
        return converter.buildDto(repository.queryTop(converter.convertQuery(query)));
    }

    @Override
    public Stream<CustomerOrderDTO> topStream(CustomerOrderQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<CustomerOrderDTO> data(CustomerOrderQuery query) {
        return converter.buildDto(repository.queryPage(converter.convertQuery(query)));
    }
}