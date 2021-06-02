package org.example.spring.repositories.oracle.customer.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.oracle.customer.converter.TCustomerOrderConverter;
import org.example.spring.repositories.oracle.customer.dao.TCustomerOrderDao;
import org.example.spring.repositories.oracle.customer.repository.TCustomerOrderRepository;
import org.example.spring.repositories.oracle.customer.table.dto.TCustomerOrderDTO;
import org.example.spring.repositories.oracle.customer.table.po.TCustomerOrder;
import org.example.spring.repositories.oracle.customer.table.query.TCustomerOrderQuery;
import org.example.spring.repositories.oracle.customer.table.vo.TCustomerOrderVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TCustomerOrderRepositoryImpl extends IBaseRepositoryImpl<TCustomerOrder, TCustomerOrderDTO, TCustomerOrderVo, TCustomerOrderQuery, TCustomerOrderConverter, TCustomerOrderDao> implements TCustomerOrderRepository {
}