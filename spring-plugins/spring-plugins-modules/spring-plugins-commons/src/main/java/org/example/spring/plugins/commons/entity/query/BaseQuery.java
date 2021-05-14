package org.example.spring.plugins.commons.entity.query;

import cn.hutool.core.util.ObjectUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.BaseEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class BaseQuery extends BaseEntity {
    private Integer page = 1;
    private Integer size = 20;
    private String order = "createDate";
    private OrderTypeEnum orderType = OrderTypeEnum.desc;

    public BaseQuery withSize(Integer size) {
        setSize(size);
        return this;
    }

    public BaseQuery withPage(Integer page) {
        setPage(page);
        return this;
    }

    public BaseQuery withOrder(String order) {
        setOrder(order);
        return this;
    }

    public BaseQuery withOrderType(OrderTypeEnum orderType) {
        setOrderType(orderType);
        return this;
    }

    public void addDefault() {
        this.page = ObjectUtil.isNotEmpty(this.page) ? this.page : 1;
        this.size = ObjectUtil.isNotEmpty(this.size) ? this.size : 20;
        this.order = ObjectUtil.isNotEmpty(this.order) ? this.order : "createDate";
        this.orderType = ObjectUtil.isNotEmpty(this.orderType) ? this.orderType : OrderTypeEnum.desc;
    }

}