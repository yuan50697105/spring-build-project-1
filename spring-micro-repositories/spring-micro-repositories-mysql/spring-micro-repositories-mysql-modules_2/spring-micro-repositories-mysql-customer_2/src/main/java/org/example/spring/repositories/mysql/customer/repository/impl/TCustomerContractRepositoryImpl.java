package org.example.spring.repositories.mysql.customer.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.customer.builder.TCustomerContractBuilder;
import org.example.spring.daos.mysql.customer.dao.TCustomerContractDao;
import org.example.spring.daos.mysql.customer.repository.TCustomerContractRepository;
import org.example.spring.daos.mysql.customer.table.dto.TCustomerContractDTO;
import org.example.spring.daos.mysql.customer.table.po.TCustomerContract;
import org.example.spring.daos.mysql.customer.table.query.TCustomerContractQuery;
import org.example.spring.daos.mysql.customer.table.vo.TCustomerContractVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.mysql.customer.dao.TCustomerContractDao;
import org.example.spring.repositories.mysql.customer.table.dto.TCustomerContractDTO;
import org.example.spring.repositories.mysql.customer.table.po.TCustomerContract;
import org.example.spring.repositories.mysql.customer.table.query.TCustomerContractQuery;
import org.example.spring.repositories.mysql.customer.table.vo.TCustomerContractVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
@AllArgsConstructor
@Transactional
public class TCustomerContractRepositoryImpl implements TCustomerContractRepository {
    private final TCustomerContractDao customerContractDao;
    private final TCustomerContractBuilder customerContractBuilder;

    @Override
    public void save(TCustomerContractVo vo) {
        customerContractDao.save(customerContractBuilder.toPo(vo));
    }


    @Override
    public void update(TCustomerContractVo vo) {
        TCustomerContract customerContract = customerContractBuilder.toPo(vo);
        Optional<TCustomerContract> optional = customerContractDao.getByIdOpt(customerContract.getId());
        if (optional.isPresent()) {
            TCustomerContract tCustomerContract = optional.get();
            customerContractBuilder.copy(customerContract, tCustomerContract);
            customerContractDao.update(tCustomerContract);
        }
    }

    @Override
    public void delete(Long id) {
        customerContractDao.deleteById(id);
    }

    @Override
    public void delete(Long... ids) {
        customerContractDao.deleteByIds(ids);
    }


    @Override
    public void delete(List<Long> ids) {
        customerContractDao.deleteByIds(ids);
    }

    @Override
    public TCustomerContractDTO get(Long id) {
        TCustomerContract customerContract = customerContractDao.getById(id);
        return customerContractBuilder.toDTO(customerContract);
    }

    @Override
    public Optional<TCustomerContractDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public TCustomerContractDTO queryOne(TCustomerContractQuery query) {
        return customerContractBuilder.toDTO(customerContractDao.queryOne(query));
    }

    @Override
    public Optional<TCustomerContractDTO> queryOneOpt(TCustomerContractQuery query) {
        return Optional.ofNullable(queryOne(query));
    }

    @Override
    public TCustomerContractDTO selectOne(TCustomerContractQuery query) {
        return customerContractBuilder.toDTO(customerContractDao.selectOne(query));
    }

    @Override
    public Optional<TCustomerContractDTO> selectOneOpt(TCustomerContractQuery query) {
        return Optional.ofNullable(selectOne(query));
    }

    @Override
    public TCustomerContractDTO queryFirst(TCustomerContractQuery query) {
        return customerContractBuilder.toDTO(customerContractDao.queryFirst(query));
    }

    @Override
    public Optional<TCustomerContractDTO> queryFirstOpt(TCustomerContractQuery query) {
        return Optional.ofNullable(queryFirst(query));
    }

    @Override
    public TCustomerContractDTO selectFirst(TCustomerContractQuery query) {
        return customerContractBuilder.toDTO(customerContractDao.selectFirst(query));
    }

    @Override
    public Optional<TCustomerContractDTO> selectFirstOpt(TCustomerContractQuery query) {
        return Optional.ofNullable(selectFirst(query));
    }

    @Override
    public List<TCustomerContractDTO> queryList(TCustomerContractQuery query) {
        return customerContractBuilder.toDTO(customerContractDao.queryList(query));
    }

    @Override
    public List<TCustomerContractDTO> selectList(TCustomerContractQuery query) {
        return customerContractBuilder.toDTO(customerContractDao.selectList(query));
    }

    @Override
    public Stream<TCustomerContractDTO> queryStream(TCustomerContractQuery query) {
        return customerContractBuilder.toDTO(customerContractDao.queryListStream(query));
    }


    @Override
    public Stream<TCustomerContractDTO> selectStream(TCustomerContractQuery query) {
        return customerContractBuilder.toDTO(customerContractDao.selectListStream(query));
    }

    @Override
    public List<TCustomerContractDTO> queryTop(TCustomerContractQuery query) {
        return customerContractBuilder.toDTO(customerContractDao.queryTop(query));
    }

    @Override
    public Stream<TCustomerContractDTO> queryTopStream(TCustomerContractQuery query) {
        return customerContractBuilder.toDTO(customerContractDao.queryTopStream(query));
    }

    @Override
    public List<TCustomerContractDTO> selectTop(TCustomerContractQuery query) {
        return customerContractBuilder.toDTO(customerContractDao.selectTop(query));
    }

    @Override
    public Stream<TCustomerContractDTO> selectTopStream(TCustomerContractQuery query) {
        return customerContractBuilder.toDTO(customerContractDao.selectTopStream(query));
    }

    @Override
    public IPageData<TCustomerContractDTO> selectPage(TCustomerContractQuery query) {
        return customerContractBuilder.toDTO(customerContractDao.selectPage(query));
    }

    @Override
    public IPageData<TCustomerContractDTO> queryPage(TCustomerContractQuery query) {
        return customerContractBuilder.toDTO(customerContractDao.queryPage(query));
    }

}