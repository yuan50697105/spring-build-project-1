package org.example.spring.models.mysql.auth.entity.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.auth.table.po.TDepartment;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class DDepartment extends TDepartment implements Serializable {
}