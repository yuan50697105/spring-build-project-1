package org.example.spring.models.mysql.auth.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.auth.table.po.TDepartment;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class Department extends TDepartment implements Serializable {
    private static final long serialVersionUID = -1480718411180552910L;
}