package org.example.spring.models.mysql.auth.entity.result;

import cn.hutool.core.lang.tree.Tree;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class AccountDetails  extends Account implements Serializable {
    private static final long serialVersionUID = -3696634452174847099L;
    private List<Role> roles;
    private List<Tree<Long>> resources;

}