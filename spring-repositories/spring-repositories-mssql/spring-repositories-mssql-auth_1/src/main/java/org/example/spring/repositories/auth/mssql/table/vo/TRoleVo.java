package org.example.spring.repositories.auth.mssql.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.auth.mssql.table.po.TRole;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Deprecated
public class TRoleVo extends TRole implements Serializable {
    private List<Long> resourceIds;

}