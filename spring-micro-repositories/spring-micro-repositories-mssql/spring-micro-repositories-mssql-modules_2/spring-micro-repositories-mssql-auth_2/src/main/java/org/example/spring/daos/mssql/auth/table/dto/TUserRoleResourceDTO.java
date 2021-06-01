package org.example.spring.daos.mssql.auth.table.dto;

import cn.hutool.core.lang.tree.Tree;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TUserRoleResourceDTO extends TUserRoleDTO implements Serializable {
    private List<TRoleDTO> roles;
    private List<Tree<Long>> resources;
}