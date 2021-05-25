package org.example.spring.daos.mysql.auth.entity.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.commons.entity.CommonsEntity;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class RoleDTO extends CommonsEntity implements Serializable {
    private String name;
}