package org.example.spring.repositories.commons.entity.report.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.query.ICommonsQuery;

@EqualsAndHashCode(callSuper = true)
@Data
public class PersonalReportInfoQuery extends ICommonsQuery {
    private Long patientId;
    private String patientName;
    private String patientIdNumber;
    private String patientPhone;
}