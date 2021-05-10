package org.example.spring.models.mysql.patient.entity.result;

import lombok.Data;

import java.util.List;

@Data
public class PatientTeamFeeItemDetails {
    private PatientTeamMealFeeItem feeItem;
    private List<PatientTeamMealCheckItem> checkItems;
}