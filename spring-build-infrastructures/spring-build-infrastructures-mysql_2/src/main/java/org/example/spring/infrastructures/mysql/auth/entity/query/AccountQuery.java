package org.example.spring.infrastructures.mysql.auth.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.auth.table.enumerate.TUserStatus;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

@EqualsAndHashCode(callSuper = true)
@Data
public class AccountQuery extends BaseQuery {
    private String username;
    private String status;

    public String getStatus() {
        return TUserStatus.get(status).getValue();
    }
}