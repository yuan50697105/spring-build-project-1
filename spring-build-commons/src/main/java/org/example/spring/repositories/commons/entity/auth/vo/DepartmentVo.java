package org.example.spring.repositories.commons.entity.auth.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.entity.auth.po.Department;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class DepartmentVo extends Department implements Serializable {
    private List<Long> roleIds;

    public DepartmentVo() {
        setPid(0L);
    }

}