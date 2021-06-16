package org.example.spring.repositories.clients.bill.mysql.api;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.bill.mysql.converter.PotentialCustomersRepositoryConverter;
import org.example.spring.repositories.clients.customer.api.PotentialCustomersRepository;
import org.example.spring.repositories.commons.entity.customer.dto.PotentialCustomersDTO;
import org.example.spring.repositories.commons.entity.customer.query.PotentialCustomersQuery;
import org.example.spring.repositories.commons.entity.customer.vo.PotentialCustomersVo;
import org.example.spring.repositories.mysql.customer.repository.TPotentialCustomersRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public class PotentialCustomersRepositoryImpl implements PotentialCustomersRepository {
    private final TPotentialCustomersRepository repository;
    private final PotentialCustomersRepositoryConverter converter;

    public PotentialCustomersRepositoryImpl(TPotentialCustomersRepository repository, PotentialCustomersRepositoryConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    @Override
    public void save(PotentialCustomersVo vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void save(PotentialCustomersVo... vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void save(List<PotentialCustomersVo> vo) {
        repository.save(converter.convertVo(vo));
    }

    @Override
    public void update(PotentialCustomersVo vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(PotentialCustomersVo... vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(List<PotentialCustomersVo> vo) {
        repository.update(converter.convertVo(vo));
    }

    @Override
    public void update(PotentialCustomersVo vo, PotentialCustomersQuery PotentialCustomersQuery) {
        repository.update(converter.convertVo(vo), converter.convertQuery(PotentialCustomersQuery));
    }

    @Override
    public void updateNull(PotentialCustomersVo vo) {
        repository.updateNull(converter.convertVo(vo));
    }

    @Override
    public void updateNull(PotentialCustomersVo vo, PotentialCustomersQuery PotentialCustomersQuery) {
        repository.updateNull(converter.convertVo(vo), converter.convertQuery(PotentialCustomersQuery));
    }

    @Override
    public void updateNull(PotentialCustomersVo... vo) {
        repository.updateNull(converter.convertVo(vo));
    }

    @Override
    public void updateNull(List<PotentialCustomersVo> vo) {
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
    public PotentialCustomersDTO get(Long id) {
        return converter.buildDto(repository.get(id));
    }

    @Override
    public Optional<PotentialCustomersDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<PotentialCustomersDTO> listByIds(Long... ids) {
        return converter.buildDto(repository.listByIds(ids));
    }

    @Override
    public List<PotentialCustomersDTO> listByIds(List<Long> ids) {
        return converter.buildDto(repository.listByIds(ids));
    }

    @Override
    public Stream<PotentialCustomersDTO> streamByIds(Long... ids) {
        return listByIds(ids).stream();
    }

    @Override
    public Stream<PotentialCustomersDTO> streamByIds(List<Long> ids) {
        return listByIds(ids).stream();
    }

    @Override
    public PotentialCustomersDTO one(PotentialCustomersQuery query) {
        return converter.buildDto(repository.queryOne(converter.convertQuery(query)));
    }

    @Override
    public Optional<PotentialCustomersDTO> oneOpt(PotentialCustomersQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public PotentialCustomersDTO first(PotentialCustomersQuery query) {
        return converter.buildDto(repository.queryFirst(converter.convertQuery(query)));
    }

    @Override
    public Optional<PotentialCustomersDTO> firstOpt(PotentialCustomersQuery query) {
        return Optional.ofNullable(first(query));
    }

    @Override
    public List<PotentialCustomersDTO> list(PotentialCustomersQuery query) {
        return converter.buildDto(repository.queryList(converter.convertQuery(query)));
    }

    @Override
    public Stream<PotentialCustomersDTO> listStream(PotentialCustomersQuery query) {
        return list(query).stream();
    }

    @Override
    public List<PotentialCustomersDTO> top(PotentialCustomersQuery query) {
        return converter.buildDto(repository.queryTop(converter.convertQuery(query)));
    }

    @Override
    public Stream<PotentialCustomersDTO> topStream(PotentialCustomersQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<PotentialCustomersDTO> data(PotentialCustomersQuery query) {
        return converter.buildDto(repository.queryPage(converter.convertQuery(query)));
    }
}