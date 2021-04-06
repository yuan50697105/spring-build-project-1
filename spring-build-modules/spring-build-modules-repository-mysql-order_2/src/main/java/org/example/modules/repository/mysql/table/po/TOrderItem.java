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
 * t_order_item
 */
@ApiModel(value = "org-example-modules-repository-mysql-entity-po-TOrderItem")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TOrderItem extends IBaseEntity implements Serializable {
    /**
     * 订单ID
     */
    @ApiModelProperty(value = "订单ID")
    private Long orderId;

    /**
     * 订单号
     */
    @ApiModelProperty(value = "订单号")
    private String orderNo;

    /**
     * 客户ID
     */
    @ApiModelProperty(value = "客户ID")
    private Long customerId;

    /**
     * 订单类型
     */
    @ApiModelProperty(value = "订单类型")
    private Integer orderType;

    /**
     * 收费项目ID
     */
    @ApiModelProperty(value = "收费项目ID")
    private Long feeItemId;

    /**
     * 都买数量
     * 默认为1
     */
    @ApiModelProperty(value = "都买数量,     * 默认为1")
    private Integer num;

    /**
     * 原价
     */
    @ApiModelProperty(value = "原价")
    private BigDecimal price;

    /**
     * 优惠价
     */
    @ApiModelProperty(value = "优惠价")
    private BigDecimal disPrice;

    /**
     * 总价
     */
    @ApiModelProperty(value = "总价")
    private BigDecimal totalPrice;

    private static final long serialVersionUID = 1L;
}