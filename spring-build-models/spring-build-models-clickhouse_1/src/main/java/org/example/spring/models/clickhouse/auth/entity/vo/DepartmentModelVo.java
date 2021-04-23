package org.example.spring.models.clickhouse.auth.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.clickhouse.auth.table.po.TDepartment;
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

    public TDepartment getDepartment() {
        TDepartment department = new TDepartment();
        department.setName(name);
        department.setCode(code);
        department.setPid(pid);
        return department;
    }
}