package org.example.spring.repositories.bill.table.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

import java.math.BigDecimal;

/**
 * 订单项目
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TBillItemsInfo extends IBaseEntity {
    private String billId;
    private String orderNo;
    private Long subBillId;
    private String subOrderNo;
    private Long itemId;
    private String itemName;
    private BigDecimal itemPrice;
    private BigDecimal num;
    private BigDecimal totalPrice;
}