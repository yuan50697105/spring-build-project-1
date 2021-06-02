package org.example.spring.repositories.mysql.customer.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.mysql.customer.converter.TPotentialCustomersConverter;
import org.example.spring.repositories.mysql.customer.dao.TPotentialCustomersDao;
import org.example.spring.repositories.mysql.customer.repository.TPotentialCustomersRepository;
import org.example.spring.repositories.mysql.customer.table.dto.TPotentialCustomersDTO;
import org.example.spring.repositories.mysql.customer.table.po.TPotentialCustomers;
import org.example.spring.repositories.mysql.customer.table.query.TPotentialCustomersQuery;
import org.example.spring.repositories.mysql.customer.table.vo.TPotentialCustomersVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TPotentialCustomersRepositoryImpl extends IBaseRepositoryImpl<TPotentialCustomers, TPotentialCustomersDTO, TPotentialCustomersVo, TPotentialCustomersQuery, TPotentialCustomersConverter, TPotentialCustomersDao> implements TPotentialCustomersRepository {
}