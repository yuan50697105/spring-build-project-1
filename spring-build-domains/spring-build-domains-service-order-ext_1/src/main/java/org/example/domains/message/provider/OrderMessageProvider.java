package org.example.domains.message.provider;

import org.example.modules.repository.mysql.entity.vo.OrderFormVo;

public interface OrderMessageProvider {
    void addOrder(OrderFormVo orderInfoVo);
}