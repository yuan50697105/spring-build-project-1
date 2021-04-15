package org.example.spring.infrastructures.elasticsearch.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

@EqualsAndHashCode(callSuper = true)
@Data
public class EAccountQuery extends BaseQuery {
    private String name;
    private String username;
    private String status;
}