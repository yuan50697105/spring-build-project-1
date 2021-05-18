package org.example.spring.models.postgresql.auth.entity.result;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.table.enumerate.TUserStatus;
import org.example.spring.daos.postgresql.auth.table.po.TUser;

import java.io.Serializable;

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
        return TUserStatus.getName(super.getStatus());
    }
}
