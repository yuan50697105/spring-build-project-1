package org.example.spring.repositories.customer.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.converter.TPotentialCustomersConverter;
import org.example.spring.repositories.customer.dao.TPotentialCustomersDao;
import org.example.spring.repositories.customer.repository.TPotentialCustomersRepository;
import org.example.spring.repositories.customer.table.dto.TPotentialCustomersDTO;
import org.example.spring.repositories.customer.table.po.TPotentialCustomers;
import org.example.spring.repositories.customer.table.query.TPotentialCustomersQuery;
import org.example.spring.repositories.customer.table.vo.TPotentialCustomersVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TPotentialCustomersRepositoryImpl extends IBaseRepositoryImpl<TPotentialCustomers, TPotentialCustomersDTO, TPotentialCustomersVo, TPotentialCustomersQuery, TPotentialCustomersConverter, TPotentialCustomersDao> implements TPotentialCustomersRepository {
}