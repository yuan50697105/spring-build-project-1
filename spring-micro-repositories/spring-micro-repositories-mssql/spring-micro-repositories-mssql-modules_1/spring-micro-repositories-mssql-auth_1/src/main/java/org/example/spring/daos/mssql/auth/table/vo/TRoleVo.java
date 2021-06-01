package org.example.spring.daos.mssql.auth.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mssql.auth.table.po.TRole;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TRoleVo extends TRole implements Serializable {
    private List<Long> resourceIds;

}