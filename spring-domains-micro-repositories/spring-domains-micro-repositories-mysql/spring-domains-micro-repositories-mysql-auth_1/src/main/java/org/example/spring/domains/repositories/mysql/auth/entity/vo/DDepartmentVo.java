package org.example.spring.models.mysql.auth.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.auth.table.vo.TDepartmentVo;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class DDepartmentVo extends TDepartmentVo implements Serializable {
}