package org.example.spring.repositories.customer.mysql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.mysql.converter.TCustomerContractConverter;
import org.example.spring.repositories.customer.mysql.dao.TCustomerContractDao;
import org.example.spring.repositories.customer.mysql.repository.TCustomerContractRepository;
import org.example.spring.repositories.customer.mysql.table.dto.TCustomerContractDTO;
import org.example.spring.repositories.customer.mysql.table.po.TCustomerContract;
import org.example.spring.repositories.customer.mysql.table.query.TCustomerContractQuery;
import org.example.spring.repositories.customer.mysql.table.vo.TCustomerContractVo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TCustomerContractRepositoryImpl extends IBaseRepositoryImpl<TCustomerContract, TCustomerContractDTO, TCustomerContractVo, TCustomerContractQuery, TCustomerContractConverter, TCustomerContractDao> implements TCustomerContractRepository {

}