package org.example.spring.repositories.customer.postgres.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.postgres.converter.TCustomerContractConverter;
import org.example.spring.repositories.customer.postgres.dao.TCustomerContractDao;
import org.example.spring.repositories.customer.postgres.repository.TCustomerContractRepository;
import org.example.spring.repositories.customer.postgres.table.dto.TCustomerContractDTO;
import org.example.spring.repositories.customer.postgres.table.po.TCustomerContract;
import org.example.spring.repositories.customer.postgres.table.query.TCustomerContractQuery;
import org.example.spring.repositories.customer.postgres.table.vo.TCustomerContractVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TCustomerContractRepositoryImpl extends IBaseRepositoryImpl<TCustomerContract, TCustomerContractDTO, TCustomerContractVo, TCustomerContractQuery, TCustomerContractConverter, TCustomerContractDao> implements TCustomerContractRepository {

}