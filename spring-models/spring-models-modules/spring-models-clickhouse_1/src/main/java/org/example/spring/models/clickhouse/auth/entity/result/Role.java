package org.example.spring.models.clickhouse.auth.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.clickhouse.auth.table.po.TRole;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class Role extends TRole implements Serializable {
    private static final long serialVersionUID = -4310728382386930248L;
}