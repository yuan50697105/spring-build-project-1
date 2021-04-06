package org.example.modules.repository.mysql.repository.impl;

import org.example.modules.repository.mysql.builder.OrderInfoBuider;
import org.example.modules.repository.mysql.dao.TOrderInfoDao;
import org.example.modules.repository.mysql.entity.result.OrderInfo;
import org.example.modules.repository.mysql.repository.OrderInfoQueryRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class OrderInfoQueryRepositoryImpl extends OrderInfoRepositoryImpl<OrderInfo> implements OrderInfoQueryRepository {
    private final TOrderInfoDao orderInfoDao;
    private final OrderInfoBuider orderInfoBuider;

    public OrderInfoQueryRepositoryImpl(TOrderInfoDao orderInfoDao, OrderInfoBuider orderInfoBuider) {
        super(orderInfoDao, orderInfoBuider);
        this.orderInfoDao = orderInfoDao;
        this.orderInfoBuider = orderInfoBuider;
    }


    @Override
    public void save(OrderInfo orderInfo) {
        throw new RuntimeException();
    }

    @Override
    public Long saveWithId(OrderInfo orderInfo) {
        throw new RuntimeException();
    }

    @Override
    public void update(OrderInfo orderInfo) {
        throw new RuntimeException();
    }
}