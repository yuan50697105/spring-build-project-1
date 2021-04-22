package org.example.spring.models.auth.entity.vo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.models.commons.entity.IModelVo;

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


    public ResourceVo getResource() {
        ResourceVo resourceVo = new ResourceVo();
        resourceVo.setName(name);
        resourceVo.setType(type);
        resourceVo.setUrl(url);
        resourceVo.setPid(pid);
        resourceVo.setWeight(weight);
        return resourceVo;
    }
}