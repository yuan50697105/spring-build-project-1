package org.example.spring.models.mysql.auth.client.entity;

import lombok.Data;

import java.util.List;

@Data
public class AccountDetailDto {
    private UserDto user;
    private List<RoleDto> roles;

}