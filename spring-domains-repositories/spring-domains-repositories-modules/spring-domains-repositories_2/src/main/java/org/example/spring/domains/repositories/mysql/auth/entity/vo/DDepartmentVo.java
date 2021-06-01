package org.example.spring.domains.repositories.mysql.auth.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.mysql.auth.table.vo.TDepartmentVo;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class DDepartmentVo extends TDepartmentVo implements Serializable {
}