package org.example.spring.repositories.customer.mysql.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.mysql.table.dto.TCustomerOrderDTO;
import org.example.spring.repositories.customer.mysql.table.po.TCustomerOrder;
import org.example.spring.repositories.customer.mysql.table.query.TCustomerOrderQuery;
import org.example.spring.repositories.customer.mysql.table.vo.TCustomerOrderVo;

public interface TCustomerOrderRepository extends IBaseRepository<TCustomerOrder, TCustomerOrderDTO, TCustomerOrderVo, TCustomerOrderQuery> {
}
