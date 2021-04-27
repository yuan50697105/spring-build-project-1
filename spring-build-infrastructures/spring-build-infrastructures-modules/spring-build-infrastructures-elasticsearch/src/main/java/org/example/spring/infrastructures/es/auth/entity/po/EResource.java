package org.example.spring.infrastructures.es.auth.entity.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.elasticsearch.entity.po.IBaseEntity;

import java.io.Serializable;

/**
 * t_permission
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-auth-table-po-TResource")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class EResource extends IBaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
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
     * url
     */
    @ApiModelProperty(value = "url")
    private String url;
    /**
     * pid
     */
    @ApiModelProperty(value = "pid")
    private Long pid;
    /**
     * weight
     */
    @ApiModelProperty(value = "weight")
    private Integer weight;
}