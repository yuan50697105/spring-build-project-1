package org.example.spring.models.postgresql.patient.entity.result;

import lombok.Data;

import java.util.List;

@Data
public class PatientTeamFeeItemDetails {
    private PatientTeamMealFeeItem feeItem;
    private List<PatientTeamMealCheckItem> checkItems;
}