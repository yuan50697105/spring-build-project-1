package org.example.spring.repositories.commons.entity.report.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.query.ICommonsQuery;

@EqualsAndHashCode(callSuper = true)
@Data
public class PersonalReportCheckItemsQuery extends ICommonsQuery {
    private Long patientId;
    private Long feeItemId;
    private Long checkItemId;
    private String checkItemName;
    private String resultType;
}