package org.example.spring.repositories.customer.mssql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.example.spring.repositories.customer.mssql.converter.TCustomerOrderConverter;
import org.example.spring.repositories.customer.mssql.dao.TCustomerOrderDao;
import org.example.spring.repositories.customer.mssql.repository.TCustomerOrderRepository;
import org.example.spring.repositories.customer.mssql.table.dto.TCustomerOrderDTO;
import org.example.spring.repositories.customer.mssql.table.po.TCustomerOrder;
import org.example.spring.repositories.customer.mssql.table.query.TCustomerOrderQuery;
import org.example.spring.repositories.customer.mssql.table.vo.TCustomerOrderVo;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TCustomerOrderRepositoryImpl extends IBaseRepositoryImpl<TCustomerOrder, TCustomerOrderDTO, TCustomerOrderVo, TCustomerOrderQuery, TCustomerOrderConverter, TCustomerOrderDao> implements TCustomerOrderRepository {
}