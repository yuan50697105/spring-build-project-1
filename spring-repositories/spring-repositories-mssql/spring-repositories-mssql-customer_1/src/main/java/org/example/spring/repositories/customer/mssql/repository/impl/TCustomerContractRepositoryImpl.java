package org.example.spring.repositories.customer.mssql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.mssql.converter.TCustomerContractConverter;
import org.example.spring.repositories.customer.mssql.dao.TCustomerContractDao;
import org.example.spring.repositories.customer.mssql.repository.TCustomerContractRepository;
import org.example.spring.repositories.customer.mssql.table.dto.TCustomerContractDTO;
import org.example.spring.repositories.customer.mssql.table.po.TCustomerContract;
import org.example.spring.repositories.customer.mssql.table.query.TCustomerContractQuery;
import org.example.spring.repositories.customer.mssql.table.vo.TCustomerContractVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TCustomerContractRepositoryImpl extends IBaseRepositoryImpl<TCustomerContract, TCustomerContractDTO, TCustomerContractVo, TCustomerContractQuery, TCustomerContractConverter, TCustomerContractDao> implements TCustomerContractRepository {

}