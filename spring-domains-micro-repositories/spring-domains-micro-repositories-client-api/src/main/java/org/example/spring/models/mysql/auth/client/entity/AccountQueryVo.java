package org.example.spring.models.mysql.auth.client.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.table.enumerate.TUserStatus;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

@EqualsAndHashCode(callSuper = true)
@Data
public class AccountQueryVo extends BaseQuery {
    private String username;
    private String name;
    private String status;

    public void setStatus(String status) {
        this.status = TUserStatus.getValue(status);
    }
}