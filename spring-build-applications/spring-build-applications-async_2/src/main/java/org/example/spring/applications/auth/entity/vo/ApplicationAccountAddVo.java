package org.example.spring.applications.auth.entity.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Data
public class ApplicationAccountAddVo {
    @NotBlank
    private String username;
    @NotBlank
    private String name;
    @NotBlank
    private String password;
    @NotBlank
    private String phone;
    private String email;
    @NotEmpty
    private List<Long> roles;


    public Set<Long> getRoles() {
        return new HashSet<>(roles);
    }

}