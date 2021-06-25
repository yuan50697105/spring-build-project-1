package org.example.spring.repositories.bill.oracle.table.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;
import org.example.spring.repositories.commons.enumerate.BillLogType;

import java.math.BigDecimal;

/**
 * 总单日志
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TBillLog extends IBaseEntity {
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 体检号
     */
    private String patientCode;
    private String patientId;
    /**
     * 当前价格
     */
    private BigDecimal currentTotalPrice;
    /**
     * 之前价格
     */
    private BigDecimal previousTotalPrice;
    /**
     * 之前Id
     */
    private Long previousId;
    /**
     * 类型
     *
     * @see BillLogType
     */
    private String type;
}