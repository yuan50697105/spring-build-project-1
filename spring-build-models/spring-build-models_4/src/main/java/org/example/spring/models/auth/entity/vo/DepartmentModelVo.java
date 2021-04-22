package org.example.spring.models.auth.entity.vo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.models.commons.entity.IModelVo;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class DepartmentModelVo extends IModelVo {
    private static final long serialVersionUID = -4189657877498124246L;

    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;

    /**
     * code
     */
    @ApiModelProperty(value = "code")
    private String code;

    /**
     * pid
     */
    @ApiModelProperty(value = "pid")
    private Long pid;
    private List<Long> roleIds;

    public DepartmentVo getDepartment() {
        DepartmentVo departmentVo = new DepartmentVo();
        departmentVo.setName(name);
        departmentVo.setCode(code);
        departmentVo.setPid(pid);
        return departmentVo;
    }
}