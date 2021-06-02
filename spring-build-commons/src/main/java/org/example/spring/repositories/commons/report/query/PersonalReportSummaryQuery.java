package org.example.spring.repositories.commons.report.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

@EqualsAndHashCode(callSuper = true)
@Data
public class PersonalReportSummaryQuery extends BaseQuery {
    private Long patientId;
}