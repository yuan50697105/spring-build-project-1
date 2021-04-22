package org.example.spring.models.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientMealFormVo extends IBaseVo {
    private PatientMealVo meal;
    private List<PatientFeeItemFormVo> items;

    public abstract void setDefault();
}