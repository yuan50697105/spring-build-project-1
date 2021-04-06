package org.example.modules.repository.mysql.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.plugins.mybatis.entity.po.IBaseEntity;

/**
 * t_order_info
 */
@ApiModel(value = "org-example-modules-repository-mysql-entity-po-TOrderInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TOrderInfo extends IBaseEntity implements Serializable {
    /**
     * orderNo
     */
    @ApiModelProperty(value = "orderNo")
    private String orderNo;

    /**
     * customerId
     */
    @ApiModelProperty(value = "customerId")
    private String customerId;

    /**
     * customerName
     */
    @ApiModelProperty(value = "customerName")
    private String customerName;

    /**
     * totalPrice
     */
    @ApiModelProperty(value = "totalPrice")
    private BigDecimal totalPrice;

    /**
     * type
     */
    @ApiModelProperty(value = "type")
    private Integer type;

    /**
     * status
     */
    @ApiModelProperty(value = "status")
    private String status;

    private static final long serialVersionUID = 1L;
}