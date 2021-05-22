package org.example.spring.domains.repositories.mysql.auth.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.auth.table.query.TDepartmentQuery;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class DDepartmentQuery extends TDepartmentQuery implements Serializable {
}