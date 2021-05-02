package org.example.spring.models.mysql.auth.client.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.models.commons.enumerate.UserStatus;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

@EqualsAndHashCode(callSuper = true)
@Data
public class AccountQueryVo extends BaseQuery {
    private String username;
    private String name;
    private UserStatus status;
}