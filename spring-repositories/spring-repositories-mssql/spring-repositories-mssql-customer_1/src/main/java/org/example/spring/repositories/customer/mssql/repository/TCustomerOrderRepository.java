package org.example.spring.repositories.customer.mssql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.mssql.table.dto.TCustomerOrderDTO;
import org.example.spring.repositories.customer.mssql.table.po.TCustomerOrder;
import org.example.spring.repositories.customer.mssql.table.query.TCustomerOrderQuery;
import org.example.spring.repositories.customer.mssql.table.vo.TCustomerOrderVo;

public interface TCustomerOrderRepository extends IBaseRepository<TCustomerOrder, TCustomerOrderDTO, TCustomerOrderVo, TCustomerOrderQuery> {
}
