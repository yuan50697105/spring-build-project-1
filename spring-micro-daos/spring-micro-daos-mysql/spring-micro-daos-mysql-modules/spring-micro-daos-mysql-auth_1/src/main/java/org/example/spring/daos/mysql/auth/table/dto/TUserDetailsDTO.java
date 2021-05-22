package org.example.spring.daos.mysql.auth.table.dto;

import cn.hutool.core.lang.tree.Tree;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TUserDetailsDTO extends TUserDTO implements Serializable {
    private List<TRoleDTO> roles;
    private List<Tree<Long>> resources;
}