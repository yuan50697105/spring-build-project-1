package org.example.spring.infrastructures.elasticsearch.entity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "account")
public class EAccount {
    private Long id;
    private String username;
    private String name;
    private String enabled;
}