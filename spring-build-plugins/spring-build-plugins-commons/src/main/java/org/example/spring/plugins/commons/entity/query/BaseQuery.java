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
    private OrderTypeEnum orderType = OrderTypeEnum.DESC;

    public void addDefault() {
        this.page = ObjectUtil.isNotEmpty(this.page) ? this.page : 1;
        this.size = ObjectUtil.isNotEmpty(this.size) ? this.size : 20;
        this.order = ObjectUtil.isNotEmpty(this.order) ? this.order : "createDate";
        this.orderType = ObjectUtil.isNotEmpty(this.orderType) ? this.orderType : OrderTypeEnum.DESC;
    }

    public enum OrderTypeEnum {
        ASC, DESC
    }
}