package org.example.spring.models.auth.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.es.auth.entity.po.ERole;

@EqualsAndHashCode(callSuper = true)
@Data
public class RoleVo extends ERole {
    private static final long serialVersionUID = -8417449420707826913L;
}