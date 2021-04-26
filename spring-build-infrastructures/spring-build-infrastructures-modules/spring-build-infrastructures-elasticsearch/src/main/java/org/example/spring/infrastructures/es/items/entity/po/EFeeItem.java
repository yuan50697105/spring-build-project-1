package org.example.spring.infrastructures.es.items.entity.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.elasticsearch.entity.po.IBaseEntity;

/**
 * t_fee_item
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-items-table-po-TFeeItem")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class EFeeItem extends IBaseEntity implements Serializable {
    /**
     * 项目编号
     */
    @ApiModelProperty(value = "项目编号")
    private String code;

    /**
     * 项目名称
     */
    @ApiModelProperty(value = "项目名称")
    private String name;

    /**
     * 价格
     */
    @ApiModelProperty(value = "价格")
    private BigDecimal price;

    /**
     * 优惠价
     */
    @ApiModelProperty(value = "优惠价")
    private BigDecimal disPrice;

    /**
     * 市价
     */
    @ApiModelProperty(value = "市价")
    private BigDecimal marketPrice;

    /**
     * 类型
     */
    @ApiModelProperty(value = "类型")
    private String type;

    /**
     * 性别
     */
    @ApiModelProperty(value = "性别")
    private String sex;

    /**
     * 年龄
     */
    @ApiModelProperty(value = "年龄")
    private Integer ageStart;

    /**
     * 年龄
     */
    @ApiModelProperty(value = "年龄")
    private Integer ageEnd;

    private static final long serialVersionUID = 1L;
}