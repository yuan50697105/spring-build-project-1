package org.example.spring.daos.mysql.auth.entity.details;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.commons.entity.CommonsEntity;

import java.io.Serializable;
import java.util.List;

@Data
public class UserDetails {
    private User user;
    private List<Role> roles;

    @EqualsAndHashCode(callSuper = true)
    @Data
    public static class User extends CommonsEntity implements Serializable{
        private String username;
        private String name;
        private String status;
    }

    public static class Role extends CommonsEntity implements Serializable {
        private String name;
    }

}