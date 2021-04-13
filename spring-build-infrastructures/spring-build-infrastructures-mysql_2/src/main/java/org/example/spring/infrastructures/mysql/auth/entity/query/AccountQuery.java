package org.example.spring.infrastructures.mysql.auth.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.auth.table.enumerate.TUserStatus;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class AccountQuery extends BaseQuery {
    private String username;
    private String status;

    public String getStatus() {
        return Optional.ofNullable(TUserStatus.get(status)).map(TUserStatus::getValue).orElse(null);
    }
}