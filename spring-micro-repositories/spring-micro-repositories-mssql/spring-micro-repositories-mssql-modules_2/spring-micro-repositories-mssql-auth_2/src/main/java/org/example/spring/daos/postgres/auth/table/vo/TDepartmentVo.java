package org.example.spring.daos.postgres.auth.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.postgres.auth.table.po.TDepartment;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TDepartmentVo extends TDepartment implements Serializable {
    private List<Long> roleIds;

    public TDepartmentVo() {
        setPid(0L);
    }

}