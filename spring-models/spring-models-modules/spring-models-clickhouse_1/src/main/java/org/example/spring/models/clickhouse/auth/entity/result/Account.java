package org.example.spring.models.clickhouse.auth.entity.result;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.clickhouse.auth.table.po.TUser;
import org.example.spring.models.commons.enumerate.UserStatus;

import java.io.Serializable;
import java.util.Optional;

/**
 * @author yuane
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Account extends TUser implements Serializable {
    private static final long serialVersionUID = -7479710667266816361L;
    @JsonIgnore
    private String password;

    @Override
    public String getStatus() {
        return Optional.ofNullable(UserStatus.get(super.getStatus())).map(UserStatus::getName).orElse(null);
    }
}
