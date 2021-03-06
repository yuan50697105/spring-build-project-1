package org.example.spring.repositories.customer.oracle.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.oracle.converter.TCustomerOrderConverter;
import org.example.spring.repositories.customer.oracle.dao.TCustomerOrderDao;
import org.example.spring.repositories.customer.oracle.repository.TCustomerOrderRepository;
import org.example.spring.repositories.customer.oracle.table.dto.TCustomerOrderDTO;
import org.example.spring.repositories.customer.oracle.table.po.TCustomerOrder;
import org.example.spring.repositories.customer.oracle.table.query.TCustomerOrderQuery;
import org.example.spring.repositories.customer.oracle.table.vo.TCustomerOrderVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TCustomerOrderRepositoryImpl extends IBaseRepositoryImpl<TCustomerOrder, TCustomerOrderDTO, TCustomerOrderVo, TCustomerOrderQuery, TCustomerOrderConverter, TCustomerOrderDao> implements TCustomerOrderRepository {
}