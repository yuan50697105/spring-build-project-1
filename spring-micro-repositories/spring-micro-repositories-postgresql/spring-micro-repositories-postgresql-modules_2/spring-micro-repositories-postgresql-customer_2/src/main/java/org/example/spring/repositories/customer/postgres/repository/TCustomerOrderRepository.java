package org.example.spring.repositories.customer.postgres.repository;

import org.example.spring.plugins.mybatis.repository.IBaseRepository;
import org.example.spring.repositories.customer.postgres.table.dto.TCustomerOrderDTO;
import org.example.spring.repositories.customer.postgres.table.po.TCustomerOrder;
import org.example.spring.repositories.customer.postgres.table.query.TCustomerOrderQuery;
import org.example.spring.repositories.customer.postgres.table.vo.TCustomerOrderVo;

public interface TCustomerOrderRepository extends IBaseRepository<TCustomerOrder, TCustomerOrderDTO, TCustomerOrderVo, TCustomerOrderQuery> {
}
