package org.example.spring.repositories.mssql.customer.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.mssql.customer.table.dto.TCustomerOrderDTO;
import org.example.spring.repositories.mssql.customer.table.po.TCustomerOrder;
import org.example.spring.repositories.mssql.customer.table.query.TCustomerOrderQuery;
import org.example.spring.repositories.mssql.customer.table.vo.TCustomerOrderVo;

public interface TCustomerOrderRepository extends IBaseRepository<TCustomerOrder, TCustomerOrderDTO, TCustomerOrderVo, TCustomerOrderQuery> {
}
