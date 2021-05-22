package org.example.spring.models.mysql.auth.client.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.ICommonsEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserDto extends ICommonsEntity {
    private String username;
    private String name;
    private String status;
}