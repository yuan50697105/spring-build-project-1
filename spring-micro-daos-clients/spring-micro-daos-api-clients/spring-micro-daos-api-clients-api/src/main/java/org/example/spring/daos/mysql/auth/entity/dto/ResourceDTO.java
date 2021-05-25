package org.example.spring.daos.mysql.auth.entity.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.ICommonsEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResourceDTO extends ICommonsEntity {
    @ApiModelProperty("name")
    private String name;
    @ApiModelProperty("type")
    private String type;
    @ApiModelProperty("url")
    private String url;
    @ApiModelProperty("pid")
    private Long pid;
    @ApiModelProperty("weight")
    private Integer weight;
}