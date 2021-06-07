package org.example.spring.repositories.commons.entity.bill.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.query.ICommonsQuery;

/**
 * 订单项目
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BillItemsInfoQuery extends ICommonsQuery {
    private String billId;
    private String orderNo;
    private String subOrderNo;
    private Long itemId;
    private String itemName;

}