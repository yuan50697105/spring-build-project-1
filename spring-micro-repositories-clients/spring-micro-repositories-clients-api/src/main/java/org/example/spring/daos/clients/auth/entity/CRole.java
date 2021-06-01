package org.example.spring.repositories.clients.auth.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.ICommonsEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class CRole extends ICommonsEntity {
    @ApiModelProperty("name")
    private String name;
}