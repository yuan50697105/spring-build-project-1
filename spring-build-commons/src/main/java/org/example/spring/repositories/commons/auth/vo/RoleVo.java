package org.example.spring.repositories.commons.auth.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.auth.po.Role;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class RoleVo extends Role implements Serializable {
    private List<Long> resourceIds;

}