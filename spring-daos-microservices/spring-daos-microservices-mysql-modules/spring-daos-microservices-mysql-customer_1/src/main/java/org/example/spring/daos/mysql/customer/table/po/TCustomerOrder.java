package org.example.spring.daos.mysql.customer.table.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

/**
 * t_customer_order
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TCustomerOrder extends IBaseEntity implements Serializable {
    /**
     * orderNo
     */
    private String orderNo;

    /**
     * customerId
     */
    private String customerId;

    /**
     * customerCode
     */
    private String customerCode;

    /**
     * customerName
     */
    private String customerName;

    /**
     * totalAmount
     */
    private BigDecimal totalAmount;

    /**
     * status
     */
    private String status;
}