package org.example.spring.infrastructures.mysql.auth.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.auth.entity.enumerate.UserStatus;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

import java.io.Serializable;
import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class AccountQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = -1686733748193152774L;
    private String username;
    private String status;

    public String getStatus() {
        return Optional.ofNullable(UserStatus.get(status)).map(UserStatus::getValue).orElse(null);
    }
}