package org.example.spring.repositories.commons.entity.customer.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.commons.entity.ICommonsEntity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * t_customer_order
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrder extends ICommonsEntity implements Serializable {
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