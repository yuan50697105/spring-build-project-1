package org.example.domains.message.provider;

import org.example.modules.repository.mysql.entity.vo.OrderInfoVo;

public interface OrderMessageProvider {
    void addOrder(OrderInfoVo orderInfoVo);
}