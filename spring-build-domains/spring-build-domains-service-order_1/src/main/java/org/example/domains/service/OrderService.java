package org.example.domains.service;

import org.example.modules.repository.mysql.entity.vo.OrderFormVo;

public interface OrderService {
    void addOrder(OrderFormVo formVo);
}
