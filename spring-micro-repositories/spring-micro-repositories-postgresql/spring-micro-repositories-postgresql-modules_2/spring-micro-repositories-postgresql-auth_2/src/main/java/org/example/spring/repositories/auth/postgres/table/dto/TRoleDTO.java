package org.example.spring.repositories.auth.postgres.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.auth.postgres.table.po.TRole;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@Deprecated
public class TRoleDTO extends TRole implements Serializable {
}