package org.example.spring.infrastructures.mysql.auth.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserQuery extends BaseQuery {
    private String username;
}