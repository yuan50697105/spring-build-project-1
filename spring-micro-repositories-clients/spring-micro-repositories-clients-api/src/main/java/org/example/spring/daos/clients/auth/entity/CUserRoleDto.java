package org.example.spring.repositories.clients.auth.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class CUserRoleDto extends CUserDto {
    private List<CRoleDto> roles;
}