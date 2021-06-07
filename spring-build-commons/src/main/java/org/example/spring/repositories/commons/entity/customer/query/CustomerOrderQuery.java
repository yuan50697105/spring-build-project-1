package org.example.spring.repositories.commons.entity.customer.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.commons.entity.query.ICommonsQuery;
import org.example.spring.repositories.commons.enumerate.CustomerOrderStatus;

import java.math.BigDecimal;

/**
 * t_customer_order
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrderQuery extends ICommonsQuery {
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
    private BigDecimal totalAmountStart;
    private BigDecimal totalAmountEnd;

    /**
     * status
     */
    private String status;

    public String getStatus() {
        return CustomerOrderStatus.getValue(status);
    }

    public void setStatus(String status) {
        this.status = CustomerOrderStatus.getValue(status);
    }
}