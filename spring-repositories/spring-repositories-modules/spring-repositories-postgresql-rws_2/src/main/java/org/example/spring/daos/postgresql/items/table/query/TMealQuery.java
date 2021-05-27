package org.example.spring.daos.postgresql.items.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.daos.postgresql.items.table.po.TMeal;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;
import java.math.BigDecimal;

@ApiModel(value = "org-example-spring-daos-postgresql-items-table-po-TMeal")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TMealQuery extends TkBaseQuery<TMeal> implements Serializable, MybatisExampleForTk<TMeal, Example> {
    /**
     * code
     */
    @ApiModelProperty(value = "code")
    @AndLike
    private String code;

    /**
     * name
     */
    @ApiModelProperty(value = "name")
    @AndLike
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