package org.example.spring.models.mysql.auth.client.entity;

import lombok.Data;

import java.util.List;

@Data
public class AccountUpdateVo {
    private Long id;
    private String name;
    private List<Long> roleIds;
}