package org.example.spring.repositories.customer.oracle.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.oracle.table.dto.TCustomerOrderDTO;
import org.example.spring.repositories.customer.oracle.table.po.TCustomerOrder;
import org.example.spring.repositories.customer.oracle.table.query.TCustomerOrderQuery;
import org.example.spring.repositories.customer.oracle.table.vo.TCustomerOrderVo;

public interface TCustomerOrderRepository extends IBaseRepository<TCustomerOrder, TCustomerOrderDTO, TCustomerOrderVo, TCustomerOrderQuery> {
}
