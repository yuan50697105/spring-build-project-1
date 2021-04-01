package org.example.modules.repository.mysql.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.mybatis.entity.vo.IBaseVo;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
public class OrderInfoVo extends IBaseVo {

    private static final long serialVersionUID = 1L;
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

}