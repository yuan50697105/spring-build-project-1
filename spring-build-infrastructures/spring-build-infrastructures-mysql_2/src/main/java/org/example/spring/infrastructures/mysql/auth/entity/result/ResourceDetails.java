package org.example.spring.infrastructures.mysql.auth.entity.result;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResourceDetails implements Serializable {
    private static final long serialVersionUID = 6981593834146168009L;
    private Resource resource;
}