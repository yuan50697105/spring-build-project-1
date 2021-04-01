package org.example.modules.repository.mysql.repository.impl;

import org.example.modules.repository.mysql.builder.OrderInfoBuider;
import org.example.modules.repository.mysql.dao.TOrderInfoDao;
import org.example.modules.repository.mysql.entity.vo.OrderAddFormVo;
import org.example.modules.repository.mysql.repository.OrderInfoAddRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class OrderInfoAddRepositoryImpl extends OrderInfoRepositoryImpl<OrderAddFormVo> implements OrderInfoAddRepository {
    public OrderInfoAddRepositoryImpl(TOrderInfoDao orderInfoDao, OrderInfoBuider orderInfoBuider) {
        super(orderInfoDao, orderInfoBuider);
    }

    @Override
    public void save(OrderAddFormVo orderAddFormVo) {

    }

    @Override
    public Long saveWithId(OrderAddFormVo orderAddFormVo) {
        return null;
    }

    @Override
    public void update(OrderAddFormVo orderAddFormVo) {

    }
}