package org.example.spring.models.mysql.auth.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.table.enumerate.TUserStatus;
import org.example.spring.models.commons.enumerate.UserStatus;
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
        return TUserStatus.getValue(status);
    }
}