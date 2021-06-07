package org.example.spring.repositories.commons.entity.items.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.commons.entity.query.ICommonsQuery;
import org.example.spring.repositories.commons.enumerate.MealType;

/**
 * t_meal
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-items-table-po-TMeal")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class MealQuery extends ICommonsQuery {
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

    public String getType() {
        return MealType.getValue(type);
    }

    public void setType(String type) {
        this.type = MealType.getValue(type);
    }
}