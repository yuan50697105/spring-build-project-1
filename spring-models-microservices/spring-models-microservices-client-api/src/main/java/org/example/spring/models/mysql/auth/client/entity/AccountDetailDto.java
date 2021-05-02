package org.example.spring.models.mysql.auth.client.entity;

import cn.hutool.core.lang.tree.Tree;
import lombok.Data;

import java.util.List;

@Data
public class AccountDetailDto {
    private UserDTO user;
    private List<RoleDTO> roles;
    private List<Tree<Long>> resources;
    @Data
    public static class UserDTO {
        private Long id;
        private String username;
        private String name;
        private String status;
    }

    @Data
    public static class RoleDTO {
        private Long id;
        private String name;
    }

}