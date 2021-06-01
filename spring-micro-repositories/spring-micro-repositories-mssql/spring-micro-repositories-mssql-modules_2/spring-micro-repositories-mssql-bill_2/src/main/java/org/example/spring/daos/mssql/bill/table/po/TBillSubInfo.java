package org.example.spring.daos.mssql.bill.table.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.table.enumerate.BillSubInfoStatus;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
public class TBillSubInfo extends IBaseEntity {
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