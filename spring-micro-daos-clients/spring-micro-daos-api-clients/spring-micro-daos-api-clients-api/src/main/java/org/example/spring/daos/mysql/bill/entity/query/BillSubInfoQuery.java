package org.example.spring.daos.mysql.bill.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.commons.entity.CommonsQuery;

import java.io.Serializable;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
public class BillSubInfoQuery extends CommonsQuery implements Serializable {
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