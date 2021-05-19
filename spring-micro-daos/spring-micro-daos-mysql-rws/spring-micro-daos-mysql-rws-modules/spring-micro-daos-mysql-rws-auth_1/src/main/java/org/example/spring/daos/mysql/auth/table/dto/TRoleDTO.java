package org.example.spring.daos.mysql.auth.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.auth.table.po.TRole;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TRoleDTO extends TRole implements Serializable {
}