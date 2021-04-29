package org.example.spring.infrastructures.mysql.items.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

/**
 * t_meal
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-items-table-po-TMeal")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TMeal extends IBaseEntity implements Serializable {
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
     * type
     */
    @ApiModelProperty(value = "type")
    private String type;

    /**
     * price
     */
    @ApiModelProperty(value = "price")
    private BigDecimal price;

    /**
     * disPrice
     */
    @ApiModelProperty(value = "disPrice")
    private BigDecimal disPrice;

    /**
     * marketPrice
     */
    @ApiModelProperty(value = "marketPrice")
    private BigDecimal marketPrice;
}