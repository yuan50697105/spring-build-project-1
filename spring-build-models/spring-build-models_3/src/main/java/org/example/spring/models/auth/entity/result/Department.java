package org.example.spring.models.auth.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.es.auth.entity.po.EDepartment;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class Department extends EDepartment implements Serializable {
    private static final long serialVersionUID = -1480718411180552910L;
}