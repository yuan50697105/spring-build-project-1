package org.example.spring.models.mysql.auth.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResourceDetails extends Resource implements Serializable {
    private static final long serialVersionUID = 6981593834146168009L;
}