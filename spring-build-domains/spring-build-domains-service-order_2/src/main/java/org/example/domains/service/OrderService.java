package org.example.domains.service;

import org.example.modules.repository.mysql.entity.vo.OrderAddFormVo;

public interface OrderService {
    void addOrder(OrderAddFormVo formVo);
}
