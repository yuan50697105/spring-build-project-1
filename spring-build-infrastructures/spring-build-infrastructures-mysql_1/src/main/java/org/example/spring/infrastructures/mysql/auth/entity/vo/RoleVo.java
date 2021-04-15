package org.example.spring.infrastructures.mysql.auth.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.auth.table.po.TRole;

@EqualsAndHashCode(callSuper = true)
@Data
public class RoleVo extends TRole {
    private static final long serialVersionUID = -8417449420707826913L;
}