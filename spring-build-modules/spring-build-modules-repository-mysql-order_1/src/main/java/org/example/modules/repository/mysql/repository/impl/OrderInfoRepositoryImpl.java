package org.example.modules.repository.mysql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.builder.OrderInfoBuider;
import org.example.modules.repository.mysql.dao.TOrderInfoDao;
import org.example.modules.repository.mysql.entity.po.TOrderInfo;
import org.example.modules.repository.mysql.entity.query.OrderInfoQuery;
import org.example.modules.repository.mysql.entity.query.TOrderInfoQuery;
import org.example.modules.repository.mysql.entity.result.OrderInfo;
import org.example.modules.repository.mysql.entity.result.OrderInfoDetails;
import org.example.modules.repository.mysql.repository.OrderInfoRepository;
import org.example.plugins.mybatis.entity.IPageData;
import org.example.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Transactional
public abstract class OrderInfoRepositoryImpl<V> extends IBaseRepositoryImpl<OrderInfo, V, OrderInfoDetails, OrderInfoQuery> implements OrderInfoRepository<V> {
    protected final TOrderInfoDao orderInfoDao;
    protected final OrderInfoBuider orderInfoBuider;

    @Override
    public void delete(List<Long> ids) {
        orderInfoDao.removeByIds(ids);
    }

    @Override
    public OrderInfoDetails getById(Long id) {
        OrderInfoDetails orderInfoDetails = new OrderInfoDetails();
        Optional<TOrderInfo> optional = orderInfoDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TOrderInfo orderInfo = optional.get();
            orderInfoDetails.setId(orderInfo.getId());
            orderInfoDetails.setOrder(orderInfoBuider.buildOrder(orderInfo));
        }
        return orderInfoDetails;
    }

    @Override
    public IPageData<OrderInfo> queryPage(OrderInfoQuery orderInfoQuery) {
        TOrderInfoQuery query = orderInfoBuider.buildQuery(orderInfoQuery);
        IPageData<TOrderInfo> pageData = orderInfoDao.queryPage(query);
        return orderInfoBuider.buildOrder(pageData);
    }

    @Override
    public List<OrderInfo> queryList(OrderInfoQuery orderInfoQuery) {
        TOrderInfoQuery query = orderInfoBuider.buildQuery(orderInfoQuery);
        List<TOrderInfo> list = orderInfoDao.queryList(query);
        return orderInfoBuider.buildOrder(list);
    }

    @Override
    public OrderInfo queryOne(OrderInfoQuery orderInfoQuery) {
        TOrderInfoQuery query = orderInfoBuider.buildQuery(orderInfoQuery);
        TOrderInfo list = orderInfoDao.queryOne(query);
        return orderInfoBuider.buildOrder(list);
    }
}