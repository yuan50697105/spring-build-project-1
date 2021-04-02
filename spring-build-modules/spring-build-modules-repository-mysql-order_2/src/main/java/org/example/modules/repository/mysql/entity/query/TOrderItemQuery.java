package org.example.modules.repository.mysql.entity.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.modules.repository.mysql.entity.po.TOrderItem;
import org.example.plugins.mybatis.entity.po.IBaseEntity;
import org.example.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * t_order_item
 */
@ApiModel(value = "org-example-modules-repository-mysql-entity-po-TOrderItem")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TOrderItemQuery extends TkBaseQuery<TOrderItem> implements Serializable, MybatisExampleForTk<TOrderItem, Example> {
    /**
     * 订单ID
     */
    @ApiModelProperty(value = "订单ID")
    @AndEqualTo
    private Long orderId;

    /**
     * 订单号
     */
    @ApiModelProperty(value = "订单号")
    @AndLike
    private String orderNo;

    /**
     * 客户ID
     */
    @ApiModelProperty(value = "客户ID")
    @AndEqualTo
    private Long customerId;

    /**
     * 订单类型
     */
    @ApiModelProperty(value = "订单类型")
    @AndEqualTo(property = "orderType")
    private Integer orderType1;

    /**
     * 收费项目ID
     */
    @ApiModelProperty(value = "收费项目ID")
    private Long feeItemId;
//
//    /**
//     * 都买数量
//     * 默认为1
//     */
//    @ApiModelProperty(value = "都买数量,     * 默认为1")
//    private Integer num;
//
//    /**
//     * 原价
//     */
//    @ApiModelProperty(value = "原价")
//    private BigDecimal price;
//
//    /**
//     * 优惠价
//     */
//    @ApiModelProperty(value = "优惠价")
//    private BigDecimal disPrice;
//
//    /**
//     * 总价
//     */
//    @ApiModelProperty(value = "总价")
//    private BigDecimal totalPrice;

    private static final long serialVersionUID = 1L;
}