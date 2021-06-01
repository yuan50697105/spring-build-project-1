package org.example.spring.daos.postgres.auth.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.postgres.auth.table.po.TRole;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TRoleDTO extends TRole implements Serializable {
}