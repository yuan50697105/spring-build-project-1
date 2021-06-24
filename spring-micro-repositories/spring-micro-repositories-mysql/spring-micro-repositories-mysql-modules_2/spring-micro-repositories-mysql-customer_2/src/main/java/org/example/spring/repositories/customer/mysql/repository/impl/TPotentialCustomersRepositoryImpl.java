package org.example.spring.repositories.customer.mysql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.mysql.converter.TPotentialCustomersConverter;
import org.example.spring.repositories.customer.mysql.dao.TPotentialCustomersDao;
import org.example.spring.repositories.customer.mysql.repository.TPotentialCustomersRepository;
import org.example.spring.repositories.customer.mysql.table.dto.TPotentialCustomersDTO;
import org.example.spring.repositories.customer.mysql.table.po.TPotentialCustomers;
import org.example.spring.repositories.customer.mysql.table.query.TPotentialCustomersQuery;
import org.example.spring.repositories.customer.mysql.table.vo.TPotentialCustomersVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TPotentialCustomersRepositoryImpl extends IBaseRepositoryImpl<TPotentialCustomers, TPotentialCustomersDTO, TPotentialCustomersVo, TPotentialCustomersQuery, TPotentialCustomersConverter, TPotentialCustomersDao> implements TPotentialCustomersRepository {
}