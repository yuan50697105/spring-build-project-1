package org.example.spring.repositories.customer.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.table.dto.TCustomerOrderDTO;
import org.example.spring.repositories.customer.table.po.TCustomerOrder;
import org.example.spring.repositories.customer.table.query.TCustomerOrderQuery;
import org.example.spring.repositories.customer.table.vo.TCustomerOrderVo;

public interface TCustomerOrderRepository extends IBaseRepository<TCustomerOrder, TCustomerOrderDTO, TCustomerOrderVo, TCustomerOrderQuery> {
}
