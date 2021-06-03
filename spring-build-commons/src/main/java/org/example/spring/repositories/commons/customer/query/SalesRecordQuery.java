package org.example.spring.repositories.commons.customer.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.commons.entity.query.ICommonsQuery;

import java.math.BigDecimal;

/**
 * 销售记录
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class SalesRecordQuery extends ICommonsQuery {
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
    private BigDecimal amountStart;
    private BigDecimal amountEnd;
}