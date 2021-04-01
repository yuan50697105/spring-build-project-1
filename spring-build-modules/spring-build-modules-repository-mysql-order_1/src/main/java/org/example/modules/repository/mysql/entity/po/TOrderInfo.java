package org.example.modules.repository.mysql.entity.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.plugins.mybatis.entity.po.IBaseEntity;

/**
 * t_order_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TOrderInfo extends IBaseEntity implements Serializable {
    /**
     * orderNo
     */
    private String orderNo;

    /**
     * customerId
     */
    private String customerId;

    /**
     * customerName
     */
    private String customerName;

    /**
     * totalPrice
     */
    private BigDecimal totalPrice;

    /**
     * type
     */
    private Integer type;

    private static final long serialVersionUID = 1L;
}