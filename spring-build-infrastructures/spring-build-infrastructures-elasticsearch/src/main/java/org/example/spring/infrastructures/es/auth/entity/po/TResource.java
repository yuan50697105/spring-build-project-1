package org.example.spring.infrastructures.es.auth.entity.po;

import cn.hutool.core.annotation.Alias;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.elasticsearch.entity.po.IBaseEntity;

/**
 * t_permission
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-auth-table-po-TResource")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TResource extends IBaseEntity implements Serializable {
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

    private static final long serialVersionUID = 1L;
}