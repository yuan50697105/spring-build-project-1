package org.example.spring.repositories.aggregation.customer.table.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 销售记录
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TSalesRecord extends IBaseEntity implements Serializable {
    /**
     * 销售员Id
     */
    private Long sellerId;

    /**
     * 销售员编号
     */
    private String sellerCode;

    /**
     * 客户ID
     */
    private Long customerId;

    /**
     * 客户编号
     */
    private String customerCode;

    /**
     * 客户姓名
     */
    private String customerName;

    /**
     * 金额
     */
    private BigDecimal amount;
}