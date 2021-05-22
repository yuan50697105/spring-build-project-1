package org.example.spring.domains.repositories.mysql.auth.entity.result;

import cn.hutool.core.lang.tree.Tree;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.domains.repositories.mysql.auth.entity.result.DAccountRoleDetailsDTO;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class DAccountDetailsDTO extends DAccountRoleDetailsDTO implements Serializable {
    private List<Tree<Long>> resources;

}