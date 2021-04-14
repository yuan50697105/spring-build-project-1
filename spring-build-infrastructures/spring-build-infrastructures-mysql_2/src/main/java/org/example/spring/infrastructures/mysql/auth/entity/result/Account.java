package org.example.spring.infrastructures.mysql.auth.entity.result;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.auth.entity.enumerate.UserStatus;
import org.example.spring.infrastructures.mysql.auth.table.po.TUser;

import java.io.Serializable;
import java.util.Optional;

/**
 * @author yuane
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Account extends TUser implements Serializable {
    @JsonIgnore
    private String password;

    @Override
    public String getStatus() {
        return Optional.ofNullable(UserStatus.get(super.getStatus())).map(UserStatus::getName).orElse(null);
    }
}
