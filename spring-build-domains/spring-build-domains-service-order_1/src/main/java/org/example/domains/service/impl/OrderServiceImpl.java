package org.example.domains.service.impl;

import lombok.AllArgsConstructor;
import org.example.domains.service.OrderService;
import org.example.modules.repository.mysql.entity.vo.OrderAddFormVo;
import org.example.modules.repository.mysql.repository.OrderInfoAddRepository;
import org.example.modules.repository.mysql.repository.OrderInfoQueryRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderInfoAddRepository orderInfoAddRepository;
    private final OrderInfoQueryRepository orderInfoQueryRepository;


    @Override
    public void addOrder(OrderAddFormVo formVo) {
        orderInfoAddRepository.save(formVo);
    }

}