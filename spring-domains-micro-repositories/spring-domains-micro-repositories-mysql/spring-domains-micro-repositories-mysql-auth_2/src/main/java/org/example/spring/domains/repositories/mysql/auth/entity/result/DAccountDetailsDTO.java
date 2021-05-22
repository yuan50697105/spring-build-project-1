package org.example.spring.models.mysql.auth.entity.result;

import cn.hutool.core.lang.tree.Tree;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class DAccountDetailsDTO extends DAccountRoleDetailsDTO implements Serializable {
    private List<Tree<Long>> resources;

}