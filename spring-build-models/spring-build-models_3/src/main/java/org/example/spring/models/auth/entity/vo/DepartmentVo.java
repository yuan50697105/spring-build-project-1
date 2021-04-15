package org.example.spring.models.auth.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.es.auth.entity.po.EDepartment;

@EqualsAndHashCode(callSuper = true)
@Data
public class DepartmentVo extends EDepartment {
    private static final long serialVersionUID = 2967156441152482970L;
}