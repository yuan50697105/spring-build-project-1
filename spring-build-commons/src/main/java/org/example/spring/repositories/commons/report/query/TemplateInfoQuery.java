package org.example.spring.repositories.commons.report.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.query.ICommonsQuery;

@EqualsAndHashCode(callSuper = true)
@Data
public class TemplateInfoQuery extends ICommonsQuery {
    private String type;
    private Long code;
    private String name;
}