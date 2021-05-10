package org.example.spring.models.mysql.auth.entity.result;

import cn.hutool.core.lang.tree.Tree;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class AccountDetails implements Serializable {
    private static final long serialVersionUID = -3696634452174847099L;
    private Account account;
    private List<Role> roles;
    private List<Tree<Long>> resources;

}