package org.example.spring.repositories.auth.oracle.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

import java.io.Serializable;

/**
 * t_permission
 */
@ApiModel(value = "org-example-spring-daos-mysql-org.example.spring.repositories.mysql.auth-table-po-TResource")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Alias("TResource")
public class TResource extends IBaseEntity implements Serializable {
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