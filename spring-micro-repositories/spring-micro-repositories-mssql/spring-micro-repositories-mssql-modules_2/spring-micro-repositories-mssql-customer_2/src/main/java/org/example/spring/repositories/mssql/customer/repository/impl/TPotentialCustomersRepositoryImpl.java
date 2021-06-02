package org.example.spring.repositories.mssql.customer.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.mssql.customer.converter.TPotentialCustomersConverter;
import org.example.spring.repositories.mssql.customer.dao.TPotentialCustomersDao;
import org.example.spring.repositories.mssql.customer.repository.TPotentialCustomersRepository;
import org.example.spring.repositories.mssql.customer.table.dto.TPotentialCustomersDTO;
import org.example.spring.repositories.mssql.customer.table.po.TPotentialCustomers;
import org.example.spring.repositories.mssql.customer.table.query.TPotentialCustomersQuery;
import org.example.spring.repositories.mssql.customer.table.vo.TPotentialCustomersVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TPotentialCustomersRepositoryImpl extends IBaseRepositoryImpl<TPotentialCustomers, TPotentialCustomersDTO, TPotentialCustomersVo, TPotentialCustomersQuery, TPotentialCustomersConverter, TPotentialCustomersDao> implements TPotentialCustomersRepository {
}