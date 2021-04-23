package org.example.spring.models.clickhouse.auth.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class RoleQuery extends BaseQuery implements Serializable {

    private static final long serialVersionUID = 1846520890370865397L;
    private String name;
}