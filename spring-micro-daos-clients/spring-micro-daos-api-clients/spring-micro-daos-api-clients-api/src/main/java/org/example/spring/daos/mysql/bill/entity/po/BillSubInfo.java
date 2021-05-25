package org.example.spring.daos.mysql.bill.entity.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.commons.entity.CommonsEntity;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
public class BillSubInfo extends CommonsEntity {
    /**
     * 子单单号
     */
    private String subOrderNo;
    /**
     * 总单ID
     */
    private String billId;
    /**
     * 总单单号
     */
    private String orderNo;
    /**
     * 总价
     */
    private BigDecimal totalPrice;
    /**
     * 状态
     */
    private String status;
}