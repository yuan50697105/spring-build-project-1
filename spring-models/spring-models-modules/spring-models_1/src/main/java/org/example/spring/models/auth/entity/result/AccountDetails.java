package org.example.spring.models.auth.entity.result;

import cn.hutool.core.lang.tree.Tree;
import lombok.Data;
import org.example.spring.models.auth.entity.dto.ResourceNode;

import java.io.Serializable;
import java.util.List;

@Data
public class AccountDetails implements Serializable {
    private static final long serialVersionUID = -3696634452174847099L;
    private Account account;
    private List<Role> roles;
    private List<Tree<Long>> resources;

}