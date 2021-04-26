package org.example.spring.infrastructures.postgresql.items.table.po;

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

@ApiModel(value = "org-example-spring-infrastructures-postgresql-items-table-po-TCheckItem")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TCheckItem extends IBaseEntity implements Serializable {
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