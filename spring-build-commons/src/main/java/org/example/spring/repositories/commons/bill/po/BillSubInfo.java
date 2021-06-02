package org.example.spring.repositories.commons.bill.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.ICommonsEntity;
import org.example.spring.repositories.commons.enumerate.BillSubInfoStatus;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
public class BillSubInfo extends ICommonsEntity {
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
     *
     * @see BillSubInfoStatus
     */
    private String status;
}