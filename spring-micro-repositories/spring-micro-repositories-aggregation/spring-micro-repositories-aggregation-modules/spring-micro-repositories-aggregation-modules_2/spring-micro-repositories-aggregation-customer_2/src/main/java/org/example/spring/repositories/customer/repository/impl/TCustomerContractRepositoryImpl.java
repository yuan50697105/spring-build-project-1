package org.example.spring.repositories.customer.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.converter.TCustomerContractConverter;
import org.example.spring.repositories.customer.dao.TCustomerContractDao;
import org.example.spring.repositories.customer.repository.TCustomerContractRepository;
import org.example.spring.repositories.customer.table.dto.TCustomerContractDTO;
import org.example.spring.repositories.customer.table.po.TCustomerContract;
import org.example.spring.repositories.customer.table.query.TCustomerContractQuery;
import org.example.spring.repositories.customer.table.vo.TCustomerContractVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TCustomerContractRepositoryImpl extends IBaseRepositoryImpl<TCustomerContract, TCustomerContractDTO, TCustomerContractVo, TCustomerContractQuery, TCustomerContractConverter, TCustomerContractDao> implements TCustomerContractRepository {

}