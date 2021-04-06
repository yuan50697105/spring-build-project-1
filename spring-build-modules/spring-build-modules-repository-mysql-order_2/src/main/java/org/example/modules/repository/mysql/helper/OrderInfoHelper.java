package org.example.modules.repository.mysql.helper;

import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.builder.OrderInfoBuider;
import org.example.modules.repository.mysql.dao.TOrderInfoDao;
import org.example.modules.repository.mysql.dao.TOrderItemDao;
import org.example.modules.repository.mysql.entity.vo.OrderFormVo;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@AllArgsConstructor
@Transactional
public class OrderInfoHelper {
    private final TOrderInfoDao orderInfoDao;
    private final TOrderItemDao orderItemDao;
    private final OrderInfoBuider orderInfoBuider;

    public void saveAddOrder(OrderFormVo orderFormVo) {

    }
}