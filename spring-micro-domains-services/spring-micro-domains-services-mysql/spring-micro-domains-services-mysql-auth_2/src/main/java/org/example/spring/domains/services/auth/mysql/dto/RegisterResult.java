package org.example.spring.domains.services.auth.mysql.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class RegisterResult implements Serializable {
    private final String username;
    private final String id;
    public RegisterResult(String username, String id) {
        this.username = username;
        this.id = id;
    }
}