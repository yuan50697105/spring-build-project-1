package org.example.spring.repositories.oracle.customer.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.oracle.customer.converter.TPotentialCustomersConverter;
import org.example.spring.repositories.oracle.customer.dao.TPotentialCustomersDao;
import org.example.spring.repositories.oracle.customer.repository.TPotentialCustomersRepository;
import org.example.spring.repositories.oracle.customer.table.dto.TPotentialCustomersDTO;
import org.example.spring.repositories.oracle.customer.table.po.TPotentialCustomers;
import org.example.spring.repositories.oracle.customer.table.query.TPotentialCustomersQuery;
import org.example.spring.repositories.oracle.customer.table.vo.TPotentialCustomersVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TPotentialCustomersRepositoryImpl extends IBaseRepositoryImpl<TPotentialCustomers, TPotentialCustomersDTO, TPotentialCustomersVo, TPotentialCustomersQuery, TPotentialCustomersConverter, TPotentialCustomersDao> implements TPotentialCustomersRepository {
}