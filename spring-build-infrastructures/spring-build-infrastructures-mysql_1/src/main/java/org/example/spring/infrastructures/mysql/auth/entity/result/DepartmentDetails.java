package org.example.spring.infrastructures.mysql.auth.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class DepartmentDetails extends IBaseVo {
    private Department department;
}