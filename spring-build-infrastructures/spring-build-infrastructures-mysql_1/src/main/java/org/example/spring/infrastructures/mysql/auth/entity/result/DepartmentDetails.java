package org.example.spring.infrastructures.mysql.auth.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;

import java.io.Serializable;

@Data
public class DepartmentDetails implements Serializable {
    private static final long serialVersionUID = 70376549749134346L;
    private Department department;
}