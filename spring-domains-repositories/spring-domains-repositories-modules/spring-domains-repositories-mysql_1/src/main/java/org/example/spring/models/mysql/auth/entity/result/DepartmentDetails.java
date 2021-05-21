package org.example.spring.models.mysql.auth.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class DepartmentDetails extends Department implements Serializable {
    private static final long serialVersionUID = 70376549749134346L;
    private List<Role> roles;
}