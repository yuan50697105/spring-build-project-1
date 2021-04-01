package org.example.domains.message.provider;

import org.example.modules.repository.mysql.entity.vo.OrderAddFormVo;

public interface OrderMessageProvider {
    void addOrder(OrderAddFormVo orderInfoVo);
}