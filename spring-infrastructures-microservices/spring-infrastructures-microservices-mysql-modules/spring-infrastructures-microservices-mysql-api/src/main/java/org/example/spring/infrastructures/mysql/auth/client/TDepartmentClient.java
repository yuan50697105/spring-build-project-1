package org.example.spring.infrastructures.mysql.auth.client;

import org.example.spring.infrastructures.mysql.auth.entity.ITDepartment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("department")
public interface TDepartmentClient {
    @PostMapping
    void save(@RequestBody ITDepartment department);

    void update(ITDepartment department);
}
