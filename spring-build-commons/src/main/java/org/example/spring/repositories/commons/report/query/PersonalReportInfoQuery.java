package org.example.spring.repositories.commons.report.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

@EqualsAndHashCode(callSuper = true)
@Data
public class PersonalReportInfoQuery extends BaseQuery {
    private Long patientId;
    private String patientName;
    private String patientIdNumber;
    private String patientPhone;
}