package org.example.spring.repositories.commons.entity.report.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.query.ICommonsQuery;

@EqualsAndHashCode(callSuper = true)
@Data
public class PersonalReportSummaryQuery extends ICommonsQuery {
    private Long patientId;
}