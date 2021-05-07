package org.example.spring.models.postgresql.auth.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class DepartmentQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = -9038496125978929268L;
}