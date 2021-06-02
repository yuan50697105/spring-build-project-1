package org.example.spring.repositories.commons.report.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

@EqualsAndHashCode(callSuper = true)
@Data
public class PersonalReportCheckItemsQuery extends BaseQuery {
    private Long patientId;
    private Long feeItemId;
    private Long checkItemId;
    private String checkItemName;
    private String resultType;
}