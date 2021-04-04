package org.example.modules.repository.mysql.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.modules.repository.mysql.table.po.TOrderInfo;

import java.io.Serializable;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
public class OrderAddVo extends TOrderInfo implements Serializable {
    private Set<OrderItemVo> items;
}