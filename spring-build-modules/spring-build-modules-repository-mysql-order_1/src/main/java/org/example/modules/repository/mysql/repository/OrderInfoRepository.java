package org.example.modules.repository.mysql.repository;

import org.example.modules.repository.mysql.entity.query.OrderInfoQuery;
import org.example.modules.repository.mysql.entity.result.OrderInfo;
import org.example.modules.repository.mysql.entity.result.OrderInfoDetails;
import org.example.plugins.mybatis.repository.IBaseRepository;

public interface OrderInfoRepository<V> extends IBaseRepository<OrderInfo, V, OrderInfoDetails, OrderInfoQuery> {
}
