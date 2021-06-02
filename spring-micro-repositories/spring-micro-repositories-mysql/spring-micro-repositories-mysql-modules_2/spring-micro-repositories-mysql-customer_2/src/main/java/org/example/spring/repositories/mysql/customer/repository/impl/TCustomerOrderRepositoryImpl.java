package org.example.spring.repositories.mysql.customer.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.mysql.customer.converter.TCustomerOrderConverter;
import org.example.spring.repositories.mysql.customer.dao.TCustomerOrderDao;
import org.example.spring.repositories.mysql.customer.repository.TCustomerOrderRepository;
import org.example.spring.repositories.mysql.customer.table.dto.TCustomerOrderDTO;
import org.example.spring.repositories.mysql.customer.table.po.TCustomerOrder;
import org.example.spring.repositories.mysql.customer.table.query.TCustomerOrderQuery;
import org.example.spring.repositories.mysql.customer.table.vo.TCustomerOrderVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TCustomerOrderRepositoryImpl extends IBaseRepositoryImpl<TCustomerOrder, TCustomerOrderDTO, TCustomerOrderVo, TCustomerOrderQuery, TCustomerOrderConverter, TCustomerOrderDao> implements TCustomerOrderRepository {
}