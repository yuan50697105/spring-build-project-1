package org.example.spring.repositories.commons.bill.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

/**
 * 订单项目
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BillItemsInfoQuery extends BaseQuery {
    private String billId;
    private String orderNo;
    private String subOrderNo;
    private Long itemId;
    private String itemName;

}