package org.example.domains.service.impl;

import lombok.AllArgsConstructor;
import org.example.domains.service.OrderService;
import org.example.modules.repository.mysql.entity.vo.OrderFormVo;
import org.example.modules.repository.mysql.repository.OrderInfoTransactionRepository;
import org.example.modules.repository.mysql.repository.OrderInfoQueryRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderInfoTransactionRepository orderInfoTransactionRepository;
    private final OrderInfoQueryRepository orderInfoQueryRepository;


    @Override
    public void addOrder(OrderFormVo formVo) {
        orderInfoTransactionRepository.save(formVo);
    }

}