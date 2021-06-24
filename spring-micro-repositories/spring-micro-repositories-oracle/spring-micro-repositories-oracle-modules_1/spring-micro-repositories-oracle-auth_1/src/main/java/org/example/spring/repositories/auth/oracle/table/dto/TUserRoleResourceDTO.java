package org.example.spring.repositories.auth.oracle.table.dto;

import cn.hutool.core.lang.tree.Tree;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Deprecated
public class TUserRoleResourceDTO extends org.example.spring.repositories.auth.oracle.table.dto.TUserRoleDTO implements Serializable {
    private List<org.example.spring.repositories.auth.oracle.table.dto.TRoleDTO> roles;
    private List<Tree<Long>> resources;
}