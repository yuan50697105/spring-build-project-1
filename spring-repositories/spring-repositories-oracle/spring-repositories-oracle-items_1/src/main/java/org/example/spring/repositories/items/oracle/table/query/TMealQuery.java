package org.example.spring.repositories.items.oracle.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import org.example.spring.repositories.commons.enumerate.MealType;
import org.example.spring.repositories.items.oracle.table.po.TMeal;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_meal
 */
@ApiModel(value = "org-example-spring-infrastructures-oracle-items-table-po-TMeal")
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
    @AndEqualTo
    private String type;

    public String getType() {
        return MealType.getValue(type);
    }

    public void setType(String type) {
        this.type = MealType.getValue(type);
    }
}