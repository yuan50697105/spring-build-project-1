package org.example.spring.daos.mysql.auth.entity.dto;

import cn.hutool.core.lang.tree.Tree;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserRoleResourceDTO extends UserRoleDTO implements Serializable {
    private List<ResourceDTO> resources;
    private List<Tree<Long>> resourceTree;
}