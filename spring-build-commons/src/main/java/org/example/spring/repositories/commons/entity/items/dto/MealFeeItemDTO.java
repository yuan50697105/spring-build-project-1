package org.example.spring.repositories.commons.entity.items.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class MealFeeItemDTO extends MealDTO implements Serializable {
    private List<FeeItemDTO> items;
}