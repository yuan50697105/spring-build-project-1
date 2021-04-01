package org.example.domains.service.impl;

import org.example.domains.message.provider.OrderMessageProvider;
import org.example.domains.service.OrderExtService;
import org.example.modules.repository.mysql.entity.vo.OrderFormVo;
import org.example.modules.repository.mysql.repository.OrderInfoTransactionRepository;
import org.example.modules.repository.mysql.repository.OrderInfoQueryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderExtServiceImpl extends OrderServiceImpl implements OrderExtService {
    private final OrderInfoTransactionRepository orderInfoTransactionRepository;
    private final OrderInfoQueryRepository orderInfoQueryRepository;
    private final OrderMessageProvider orderMessageProvider;

    public OrderExtServiceImpl(OrderInfoTransactionRepository orderInfoTransactionRepository, OrderInfoQueryRepository orderInfoQueryRepository, OrderMessageProvider orderMessageProvider) {
        super(orderInfoTransactionRepository, orderInfoQueryRepository);
        this.orderInfoTransactionRepository = orderInfoTransactionRepository;
        this.orderInfoQueryRepository = orderInfoQueryRepository;
        this.orderMessageProvider = orderMessageProvider;
    }


    @Override
    public void addOrder(OrderFormVo formVo) {
        orderMessageProvider.addOrder(formVo);
        super.addOrder(formVo);
    }

}