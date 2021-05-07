package org.example.spring.models.auth.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.auth.table.po.TResource;
import org.example.spring.models.commons.entity.IModelVo;
import org.example.spring.models.commons.enumerate.ResourceType;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResourceModelVo extends IModelVo {
    private static final long serialVersionUID = -7410245752558971359L;

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


    public TResource getResource() {
        TResource resource = new TResource();
        resource.setName(name);
        resource.setType(ResourceType.get(type).getValue());
        resource.setUrl(url);
        resource.setPid(pid);
        resource.setWeight(weight);
        return resource;
    }
}