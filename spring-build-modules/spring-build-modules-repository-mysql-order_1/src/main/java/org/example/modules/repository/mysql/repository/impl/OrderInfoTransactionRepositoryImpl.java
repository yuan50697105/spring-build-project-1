package org.example.modules.repository.mysql.repository.impl;

import org.example.modules.repository.mysql.builder.OrderInfoBuider;
import org.example.modules.repository.mysql.dao.TOrderInfoDao;
import org.example.modules.repository.mysql.entity.query.OrderInfoQuery;
import org.example.modules.repository.mysql.entity.result.OrderInfo;
import org.example.modules.repository.mysql.entity.vo.OrderFormVo;
import org.example.modules.repository.mysql.repository.OrderInfoTransactionRepository;
import org.example.plugins.mybatis.entity.IPageData;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class OrderInfoTransactionRepositoryImpl extends OrderInfoRepositoryImpl<OrderFormVo> implements OrderInfoTransactionRepository {
    public OrderInfoTransactionRepositoryImpl(TOrderInfoDao orderInfoDao, OrderInfoBuider orderInfoBuider) {
        super(orderInfoDao, orderInfoBuider);
    }

    @Override
    public void save(OrderFormVo orderFormVo) {

    }

    @Override
    public Long saveWithId(OrderFormVo orderFormVo) {
        return null;
    }

    @Override
    public void update(OrderFormVo orderFormVo) {

    }

    @Override
    public IPageData<OrderInfo> queryPage(OrderInfoQuery orderInfoQuery) {
        throw new RuntimeException();
//        return super.queryPage(orderInfoQuery);
    }

    @Override
    public List<OrderInfo> queryList(OrderInfoQuery orderInfoQuery) {
        throw new RuntimeException();
//        return super.queryList(orderInfoQuery);
    }

    @Override
    public OrderInfo queryOne(OrderInfoQuery orderInfoQuery) {
        throw new RuntimeException();
//        return super.queryOne(orderInfoQuery);
    }
}