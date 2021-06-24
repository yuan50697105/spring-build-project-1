package org.example.spring.repositories.customer.oracle.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.oracle.converter.TPotentialCustomersConverter;
import org.example.spring.repositories.customer.oracle.dao.TPotentialCustomersDao;
import org.example.spring.repositories.customer.oracle.repository.TPotentialCustomersRepository;
import org.example.spring.repositories.customer.oracle.table.dto.TPotentialCustomersDTO;
import org.example.spring.repositories.customer.oracle.table.po.TPotentialCustomers;
import org.example.spring.repositories.customer.oracle.table.query.TPotentialCustomersQuery;
import org.example.spring.repositories.customer.oracle.table.vo.TPotentialCustomersVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TPotentialCustomersRepositoryImpl extends IBaseRepositoryImpl<TPotentialCustomers, TPotentialCustomersDTO, TPotentialCustomersVo, TPotentialCustomersQuery, TPotentialCustomersConverter, TPotentialCustomersDao> implements TPotentialCustomersRepository {
}