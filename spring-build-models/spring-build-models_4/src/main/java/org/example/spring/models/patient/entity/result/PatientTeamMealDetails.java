package org.example.spring.models.patient.entity.result;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
public class PatientTeamMealDetails {
    private PatientTeamMeal meal;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<PatientTeamMealFeeItem> feeItem;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<PatientTeamFeeItemDetails> details;
}