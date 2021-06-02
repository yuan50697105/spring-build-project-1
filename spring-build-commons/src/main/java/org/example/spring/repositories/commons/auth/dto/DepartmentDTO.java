package org.example.spring.repositories.commons.auth.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.auth.po.Department;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class DepartmentDTO extends Department implements Serializable {
}