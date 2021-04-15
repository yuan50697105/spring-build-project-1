package org.example.spring.plugins.commons.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public abstract class BaseEntity implements Serializable {


    private static final long serialVersionUID = -5543758035153062715L;
}