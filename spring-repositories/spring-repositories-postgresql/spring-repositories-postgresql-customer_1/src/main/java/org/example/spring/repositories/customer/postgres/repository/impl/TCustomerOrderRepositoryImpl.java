package org.example.spring.repositories.customer.postgres.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.postgres.converter.TCustomerOrderConverter;
import org.example.spring.repositories.customer.postgres.dao.TCustomerOrderDao;
import org.example.spring.repositories.customer.postgres.repository.TCustomerOrderRepository;
import org.example.spring.repositories.customer.postgres.table.dto.TCustomerOrderDTO;
import org.example.spring.repositories.customer.postgres.table.po.TCustomerOrder;
import org.example.spring.repositories.customer.postgres.table.query.TCustomerOrderQuery;
import org.example.spring.repositories.customer.postgres.table.vo.TCustomerOrderVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TCustomerOrderRepositoryImpl extends IBaseRepositoryImpl<TCustomerOrder, TCustomerOrderDTO, TCustomerOrderVo, TCustomerOrderQuery, TCustomerOrderConverter, TCustomerOrderDao> implements TCustomerOrderRepository {
}