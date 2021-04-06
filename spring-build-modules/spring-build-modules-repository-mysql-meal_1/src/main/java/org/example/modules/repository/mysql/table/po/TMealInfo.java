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
 * t_meal_info
 */
@ApiModel(value = "org-example-modules-repository-mysql-entity-po-TMealInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TMealInfo extends IBaseEntity implements Serializable {
    /**
     * 套餐编号
     */
    @ApiModelProperty(value = "套餐编号")
    private String code;

    /**
     * 套餐名称
     */
    @ApiModelProperty(value = "套餐名称")
    private String name;

    /**
     * 适用性 性别
     */
    @ApiModelProperty(value = "适用性 性别")
    private String applicabilitySex;

    /**
     * 适用性 婚否
     */
    @ApiModelProperty(value = "适用性 婚否")
    private String applicableMarriage;

    /**
     * 适用性 生育
     */
    @ApiModelProperty(value = "适用性 生育")
    private String applicableFertility;

    /**
     * 适用性 年龄 开始
     */
    @ApiModelProperty(value = "适用性 年龄 开始")
    private Integer applicableAgeStart;

    /**
     * 适用性 年龄 结束
     */
    @ApiModelProperty(value = "适用性 年龄 结束")
    private Integer applicableAgeEnd;

    /**
     * 总价
     */
    @ApiModelProperty(value = "总价")
    private BigDecimal price;

    /**
     * 折扣价
     */
    @ApiModelProperty(value = "折扣价")
    private BigDecimal disPrice;

    /**
     * 折扣率
     */
    @ApiModelProperty(value = "折扣率")
    private BigDecimal discount;

    private static final long serialVersionUID = 1L;
}