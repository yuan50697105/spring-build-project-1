package org.example.spring.daos.clients.auth.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class CRoleVo extends CRole {
    private List<Long> roleIds;
}