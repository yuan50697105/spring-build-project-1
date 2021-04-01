package org.example.modules.repository.mysql.builder;

import org.example.modules.repository.mysql.entity.po.TOrderInfo;
import org.example.modules.repository.mysql.entity.query.OrderInfoQuery;
import org.example.modules.repository.mysql.entity.query.TOrderInfoQuery;
import org.example.modules.repository.mysql.entity.result.OrderInfo;
import org.example.plugins.mybatis.entity.IPageData;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderInfoBuider {
    OrderInfo buildOrder(TOrderInfo orderInfo);

    TOrderInfoQuery buildQuery(OrderInfoQuery orderInfoQuery);

    IPageData<OrderInfo> buildOrder(IPageData<TOrderInfo> pageData);

    List<OrderInfo> buildOrder(List<TOrderInfo> list);
}
