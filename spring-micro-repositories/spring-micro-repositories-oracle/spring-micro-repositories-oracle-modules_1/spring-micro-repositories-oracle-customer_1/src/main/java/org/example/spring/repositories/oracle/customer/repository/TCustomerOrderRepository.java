package org.example.spring.repositories.oracle.customer.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.oracle.customer.table.dto.TCustomerOrderDTO;
import org.example.spring.repositories.oracle.customer.table.po.TCustomerOrder;
import org.example.spring.repositories.oracle.customer.table.query.TCustomerOrderQuery;
import org.example.spring.repositories.oracle.customer.table.vo.TCustomerOrderVo;

public interface TCustomerOrderRepository extends IBaseRepository<TCustomerOrder, TCustomerOrderDTO, TCustomerOrderVo, TCustomerOrderQuery> {
}
