package org.example.spring.models.mysql.auth.entity.result;

import cn.hutool.core.lang.tree.Tree;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class DAccountDetailsDTO extends DAccountDTO implements Serializable {
    private List<DRoleDTO> roles;
    private List<Tree<Long>> resources;

}