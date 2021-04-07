package org.example.spring.infrastructures.mysql.auth.entity.result;

import lombok.Data;

import java.util.List;

@Data
public class AccountDetails {
    private Account account;
    private List<Role> roles;
}