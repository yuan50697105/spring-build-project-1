package org.example.spring.models.auth.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class DepartmentFormVo extends IBaseVo {
    private static final long serialVersionUID = -4189657877498124246L;
    private DepartmentVo department;
}