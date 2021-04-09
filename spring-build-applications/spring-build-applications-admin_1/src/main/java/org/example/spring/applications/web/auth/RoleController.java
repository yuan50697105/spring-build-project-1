package org.example.spring.applications.web.auth;

import lombok.AllArgsConstructor;
import org.example.spring.domains.service.RoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("role")
@AllArgsConstructor
public class RoleController {
    private final RoleService roleService;


}