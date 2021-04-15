package org.example.spring.infrastructures.mysql.auth.entity.result;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class AccountDetails implements Serializable {
    private static final long serialVersionUID = -3696634452174847099L;
    private Account account;
    private List<Role> roles;
    private List<Resource> permissions;

}