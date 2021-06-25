package org.example.spring.repositories.customer.postgres.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.postgres.converter.TPotentialCustomersConverter;
import org.example.spring.repositories.customer.postgres.dao.TPotentialCustomersDao;
import org.example.spring.repositories.customer.postgres.repository.TPotentialCustomersRepository;
import org.example.spring.repositories.customer.postgres.table.dto.TPotentialCustomersDTO;
import org.example.spring.repositories.customer.postgres.table.po.TPotentialCustomers;
import org.example.spring.repositories.customer.postgres.table.query.TPotentialCustomersQuery;
import org.example.spring.repositories.customer.postgres.table.vo.TPotentialCustomersVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TPotentialCustomersRepositoryImpl extends IBaseRepositoryImpl<TPotentialCustomers, TPotentialCustomersDTO, TPotentialCustomersVo, TPotentialCustomersQuery, TPotentialCustomersConverter, TPotentialCustomersDao> implements TPotentialCustomersRepository {
}