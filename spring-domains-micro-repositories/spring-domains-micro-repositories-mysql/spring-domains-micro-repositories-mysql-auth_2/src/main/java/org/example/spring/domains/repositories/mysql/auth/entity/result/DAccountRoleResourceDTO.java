package org.example.spring.domains.repositories.mysql.auth.entity.result;

import cn.hutool.core.lang.tree.Tree;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class DAccountRoleResourceDTO extends DAccountRoleDTO implements Serializable {
    private List<Tree<Long>> resources;
}