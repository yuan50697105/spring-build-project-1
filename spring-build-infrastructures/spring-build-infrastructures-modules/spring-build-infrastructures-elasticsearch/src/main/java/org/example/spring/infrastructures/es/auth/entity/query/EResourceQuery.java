package org.example.spring.infrastructures.es.auth.entity.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.elasticsearch.entity.query.IBaseQuery;

/**
    * t_permission
    */
@ApiModel(value="org-example-spring-infrastructures-mysql-auth-table-po-TPermission")
@Data
@EqualsAndHashCode(callSuper=true)
@AllArgsConstructor
@NoArgsConstructor
public class EResourceQuery extends IBaseQuery{
    /**
    * name
    */
    @ApiModelProperty(value="name")
    private String name;

    /**
    * type
    */
    @ApiModelProperty(value="type")
    private String type;
    private Long pid;

    private static final long serialVersionUID = 1L;
}