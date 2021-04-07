package org.example.spring.infrastructures.mysql.auth.entity.result;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.auth.table.po.TUser;

/**
 * @author yuane
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Account extends TUser {
    @JsonIgnore
    private String password;
}
