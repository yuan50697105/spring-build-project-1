package org.example.spring.models.mysql.auth.client.entity;

import lombok.Data;

@Data
public class AccountDto {
    private Long id;
    private String username;
    private String name;
    private String status;
}