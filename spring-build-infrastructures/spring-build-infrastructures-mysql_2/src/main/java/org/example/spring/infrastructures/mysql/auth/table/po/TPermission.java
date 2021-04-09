package org.example.spring.infrastructures.mysql.auth.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.infrastructures.mysql.auth.table.enumerate.TResourceType;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

/**
    * t_permission
    */
@ApiModel(value="org-example-spring-infrastructures-mysql-auth-table-po-TPermission")
@Data
@EqualsAndHashCode(callSuper=true)
@AllArgsConstructor
@NoArgsConstructor
public class TPermission extends IBaseEntity implements Serializable {
    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;

    /**
     * type
     */
    @ApiModelProperty(value = "type")
    private TResourceType type;
    private String url;
    private Long pid = 0L;
    private Integer weight = 0;
    private static final long serialVersionUID = 1L;
}