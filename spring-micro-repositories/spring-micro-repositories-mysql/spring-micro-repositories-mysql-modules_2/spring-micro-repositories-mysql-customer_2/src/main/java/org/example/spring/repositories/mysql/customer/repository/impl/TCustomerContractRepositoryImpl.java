package org.example.spring.repositories.mysql.customer.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.mysql.customer.converter.TCustomerContractConverter;
import org.example.spring.repositories.mysql.customer.dao.TCustomerContractDao;
import org.example.spring.repositories.mysql.customer.repository.TCustomerContractRepository;
import org.example.spring.repositories.mysql.customer.table.dto.TCustomerContractDTO;
import org.example.spring.repositories.mysql.customer.table.po.TCustomerContract;
import org.example.spring.repositories.mysql.customer.table.query.TCustomerContractQuery;
import org.example.spring.repositories.mysql.customer.table.vo.TCustomerContractVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TCustomerContractRepositoryImpl extends IBaseRepositoryImpl<TCustomerContract, TCustomerContractDTO, TCustomerContractVo, TCustomerContractQuery, TCustomerContractConverter, TCustomerContractDao> implements TCustomerContractRepository {

}