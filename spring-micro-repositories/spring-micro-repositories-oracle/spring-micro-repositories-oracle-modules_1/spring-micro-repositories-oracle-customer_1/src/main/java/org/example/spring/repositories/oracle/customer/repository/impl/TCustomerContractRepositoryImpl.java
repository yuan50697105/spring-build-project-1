package org.example.spring.repositories.oracle.customer.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.oracle.customer.converter.TCustomerContractConverter;
import org.example.spring.repositories.oracle.customer.dao.TCustomerContractDao;
import org.example.spring.repositories.oracle.customer.repository.TCustomerContractRepository;
import org.example.spring.repositories.oracle.customer.table.dto.TCustomerContractDTO;
import org.example.spring.repositories.oracle.customer.table.po.TCustomerContract;
import org.example.spring.repositories.oracle.customer.table.query.TCustomerContractQuery;
import org.example.spring.repositories.oracle.customer.table.vo.TCustomerContractVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TCustomerContractRepositoryImpl extends IBaseRepositoryImpl<TCustomerContract, TCustomerContractDTO, TCustomerContractVo, TCustomerContractQuery, TCustomerContractConverter, TCustomerContractDao> implements TCustomerContractRepository {

}