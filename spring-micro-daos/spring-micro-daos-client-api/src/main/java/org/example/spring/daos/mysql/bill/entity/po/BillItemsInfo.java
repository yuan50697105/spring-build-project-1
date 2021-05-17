package org.example.spring.daos.mysql.bill.entity.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.commons.entity.CommonsEntity;

import java.io.Serializable;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
public class BillItemsInfo extends CommonsEntity implements Serializable {
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