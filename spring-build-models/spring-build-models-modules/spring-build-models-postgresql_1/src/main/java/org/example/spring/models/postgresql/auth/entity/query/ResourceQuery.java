package org.example.spring.models.postgresql.auth.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResourceQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 6289411326221374963L;
    private String name;
}