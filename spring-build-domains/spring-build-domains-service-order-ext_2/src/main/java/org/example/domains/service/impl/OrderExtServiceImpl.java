package org.example.domains.service.impl;

import org.example.domains.message.provider.OrderMessageProvider;
import org.example.domains.service.OrderExtService;
import org.example.modules.repository.mysql.entity.vo.OrderAddFormVo;
import org.example.modules.repository.mysql.repository.OrderInfoAddRepository;
import org.example.modules.repository.mysql.repository.OrderInfoQueryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderExtServiceImpl extends OrderServiceImpl implements OrderExtService {
    private final OrderInfoAddRepository orderInfoAddRepository;
    private final OrderInfoQueryRepository orderInfoQueryRepository;
    private final OrderMessageProvider orderMessageProvider;

    public OrderExtServiceImpl(OrderInfoAddRepository orderInfoAddRepository, OrderInfoQueryRepository orderInfoQueryRepository, OrderMessageProvider orderMessageProvider) {
        super(orderInfoAddRepository, orderInfoQueryRepository);
        this.orderInfoAddRepository = orderInfoAddRepository;
        this.orderInfoQueryRepository = orderInfoQueryRepository;
        this.orderMessageProvider = orderMessageProvider;
    }


    @Override
    public void addOrder(OrderAddFormVo formVo) {
        orderMessageProvider.addOrder(formVo);
        super.addOrder(formVo);
    }

}