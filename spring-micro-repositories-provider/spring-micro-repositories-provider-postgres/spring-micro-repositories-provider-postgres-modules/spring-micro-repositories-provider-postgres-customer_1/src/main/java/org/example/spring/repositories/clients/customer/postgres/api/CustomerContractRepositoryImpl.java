package org.example.spring.repositories.clients.customer.postgres.api;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.customer.api.CustomerContractRepository;
import org.example.spring.repositories.clients.customer.postgres.converter.CustomerContractRepositoryConverter;
import org.example.spring.repositories.commons.entity.customer.dto.CustomerContractDTO;
import org.example.spring.repositories.commons.entity.customer.query.CustomerContractQuery;
import org.example.spring.repositories.commons.entity.customer.vo.CustomerContractVo;
import org.example.spring.repositories.postgres.customer.repository.TCustomerContractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public class CustomerContractRepositoryImpl implements CustomerContractRepository {
    private final TCustomerContractRepository repository;
    private final CustomerContractRepositoryConverter converter;

    public CustomerContractRepositoryImpl(TCustomerContractRepository repository, CustomerContractRepositoryConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    @Override
    public void save(CustomerContractVo vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void save(CustomerContractVo... vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void save(List<CustomerContractVo> vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void update(CustomerContractVo vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(CustomerContractVo... vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(List<CustomerContractVo> vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(CustomerContractVo vo, CustomerContractQuery customerContractQuery) {
        repository.update(converter.convertVo(vo), converter.convertQuery(customerContractQuery));
    }

    @Override
    public void updateNull(CustomerContractVo vo) {
        repository.updateNull(converter.convertVo(vo));
    }

    @Override
    public void updateNull(CustomerContractVo vo, CustomerContractQuery customerContractQuery) {
        repository.updateNull(converter.convertVo(vo), converter.convertQuery(customerContractQuery));
    }

    @Override
    public void updateNull(CustomerContractVo... vo) {
        repository.updateNull(converter.convertVo(vo));
    }

    @Override
    public void updateNull(List<CustomerContractVo> vo) {
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
    public CustomerContractDTO get(Long id) {
        return converter.buildDto(repository.get(id));
    }

    @Override
    public Optional<CustomerContractDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<CustomerContractDTO> listByIds(Long... ids) {
        return converter.buildDto(repository.listByIds(ids));
    }

    @Override
    public List<CustomerContractDTO> listByIds(List<Long> ids) {
        return converter.buildDto(repository.listByIds(ids));
    }

    @Override
    public Stream<CustomerContractDTO> streamByIds(Long... ids) {
        return listByIds(ids).stream();
    }

    @Override
    public Stream<CustomerContractDTO> streamByIds(List<Long> ids) {
        return listByIds(ids).stream();
    }

    @Override
    public CustomerContractDTO one(CustomerContractQuery query) {
        return converter.buildDto(repository.queryOne(converter.convertQuery(query)));
    }

    @Override
    public Optional<CustomerContractDTO> oneOpt(CustomerContractQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public CustomerContractDTO first(CustomerContractQuery query) {
        return converter.buildDto(repository.queryFirst(converter.convertQuery(query)));
    }

    @Override
    public Optional<CustomerContractDTO> firstOpt(CustomerContractQuery query) {
        return Optional.ofNullable(first(query));
    }

    @Override
    public List<CustomerContractDTO> list(CustomerContractQuery query) {
        return converter.buildDto(repository.queryList(converter.convertQuery(query)));
    }

    @Override
    public Stream<CustomerContractDTO> listStream(CustomerContractQuery query) {
        return list(query).stream();
    }

    @Override
    public List<CustomerContractDTO> top(CustomerContractQuery query) {
        return converter.buildDto(repository.queryTop(converter.convertQuery(query)));
    }

    @Override
    public Stream<CustomerContractDTO> topStream(CustomerContractQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<CustomerContractDTO> data(CustomerContractQuery query) {
        return converter.buildDto(repository.queryPage(converter.convertQuery(query)));
    }
}