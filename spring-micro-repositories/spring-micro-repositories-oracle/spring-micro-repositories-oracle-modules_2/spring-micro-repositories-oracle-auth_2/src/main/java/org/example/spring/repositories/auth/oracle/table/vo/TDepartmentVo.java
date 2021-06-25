package org.example.spring.repositories.auth.oracle.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.auth.oracle.table.po.TDepartment;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Deprecated
public class TDepartmentVo extends TDepartment implements Serializable {
    private List<Long> roleIds;

    public TDepartmentVo() {
        setPid(0L);
    }

}