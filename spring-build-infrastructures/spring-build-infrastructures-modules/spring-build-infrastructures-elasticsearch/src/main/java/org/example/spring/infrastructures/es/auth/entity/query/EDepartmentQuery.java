package org.example.spring.infrastructures.es.auth.entity.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.elasticsearch.entity.query.IBaseQuery;

/**
 * t_department
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-auth-table-po-TDepartment")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class EDepartmentQuery extends IBaseQuery{
    private static final long serialVersionUID = 1L;
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
}