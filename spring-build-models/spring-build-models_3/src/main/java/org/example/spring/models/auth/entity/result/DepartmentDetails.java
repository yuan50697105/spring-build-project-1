package org.example.spring.models.auth.entity.result;

import lombok.Data;

import java.io.Serializable;

@Data
public class DepartmentDetails implements Serializable {
    private static final long serialVersionUID = 70376549749134346L;
    private Department department;
}