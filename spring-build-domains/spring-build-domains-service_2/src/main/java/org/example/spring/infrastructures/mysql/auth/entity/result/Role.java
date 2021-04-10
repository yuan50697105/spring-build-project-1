package org.example.spring.infrastructures.mysql.auth.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.auth.table.po.TRole;

@EqualsAndHashCode(callSuper = true)
@Data
public class Role extends TRole {
}