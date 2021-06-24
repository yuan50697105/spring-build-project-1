package org.example.spring.repositories.customer.mysql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.mysql.converter.TCustomerOrderConverter;
import org.example.spring.repositories.customer.mysql.dao.TCustomerOrderDao;
import org.example.spring.repositories.customer.mysql.repository.TCustomerOrderRepository;
import org.example.spring.repositories.customer.mysql.table.dto.TCustomerOrderDTO;
import org.example.spring.repositories.customer.mysql.table.po.TCustomerOrder;
import org.example.spring.repositories.customer.mysql.table.query.TCustomerOrderQuery;
import org.example.spring.repositories.customer.mysql.table.vo.TCustomerOrderVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TCustomerOrderRepositoryImpl extends IBaseRepositoryImpl<TCustomerOrder, TCustomerOrderDTO, TCustomerOrderVo, TCustomerOrderQuery, TCustomerOrderConverter, TCustomerOrderDao> implements TCustomerOrderRepository {
}