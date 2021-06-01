package org.example.spring.daos.mysql.auth.table.dto;

import cn.hutool.core.lang.tree.Tree;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TUserRoleResourceDTO extends org.example.spring.daos.mysql.auth.table.dto.TUserRoleDTO implements Serializable {
    private List<org.example.spring.daos.mysql.auth.table.dto.TRoleDTO> roles;
    private List<Tree<Long>> resources;
}