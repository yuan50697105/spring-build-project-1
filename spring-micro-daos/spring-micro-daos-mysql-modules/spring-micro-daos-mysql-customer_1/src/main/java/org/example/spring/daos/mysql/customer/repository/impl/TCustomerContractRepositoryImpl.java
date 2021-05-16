package org.example.spring.daos.mysql.customer.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.customer.builder.TCustomerContractBuilder;
import org.example.spring.daos.mysql.customer.dao.TCustomerContractDao;
import org.example.spring.daos.mysql.customer.repository.TCustomerContractRepository;
import org.example.spring.daos.mysql.customer.table.dto.TCustomerContractDTO;
import org.example.spring.daos.mysql.customer.table.po.TCustomerContract;
import org.example.spring.daos.mysql.customer.table.query.TCustomerContractQuery;
import org.example.spring.daos.mysql.customer.table.vo.TCustomerContractVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.css.Rect;

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
    public void insert(TCustomerContractVo vo) {
         customerContractDao.insert(customerContractBuilder.toPo(vo));
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

    public List<TCustomerContractDTO> selectTop(TCustomerContractQuery query) {
        return customerContractBuilder.toDTO(customerContractDao.top)
    }

}