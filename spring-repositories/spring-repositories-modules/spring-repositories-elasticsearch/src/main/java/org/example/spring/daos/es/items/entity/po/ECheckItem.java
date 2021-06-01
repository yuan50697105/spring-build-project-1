package org.example.spring.repositories.es.items.entity.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.elasticsearch.entity.po.IBaseEntity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * t_check_item
 */
@ApiModel(value = "org-example-spring-daos-mysql-items-table-po-TCheckItem")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class ECheckItem extends IBaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * feeItemId
     */
    @ApiModelProperty(value = "feeItemId")
    private Long feeItemId;
    /**
     * code
     */
    @ApiModelProperty(value = "code")
    private String code;
    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;
    /**
     * lowestValue
     */
    @ApiModelProperty(value = "lowestValue")
    private BigDecimal lowestValue;
    /**
     * highestValue
     */
    @ApiModelProperty(value = "highestValue")
    private BigDecimal highestValue;
    /**
     * yinYang
     */
    @ApiModelProperty(value = "yinYang")
    private String yinYang;
    /**
     * lisCode
     */
    @ApiModelProperty(value = "lisCode")
    private String lisCode;
}