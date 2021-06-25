package org.example.spring.repositories.customer.mssql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.mssql.converter.TPotentialCustomersConverter;
import org.example.spring.repositories.customer.mssql.dao.TPotentialCustomersDao;
import org.example.spring.repositories.customer.mssql.repository.TPotentialCustomersRepository;
import org.example.spring.repositories.customer.mssql.table.dto.TPotentialCustomersDTO;
import org.example.spring.repositories.customer.mssql.table.po.TPotentialCustomers;
import org.example.spring.repositories.customer.mssql.table.query.TPotentialCustomersQuery;
import org.example.spring.repositories.customer.mssql.table.vo.TPotentialCustomersVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TPotentialCustomersRepositoryImpl extends IBaseRepositoryImpl<TPotentialCustomers, TPotentialCustomersDTO, TPotentialCustomersVo, TPotentialCustomersQuery, TPotentialCustomersConverter, TPotentialCustomersDao> implements TPotentialCustomersRepository {
}