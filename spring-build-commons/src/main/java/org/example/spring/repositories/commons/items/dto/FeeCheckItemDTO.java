package org.example.spring.repositories.commons.items.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class FeeCheckItemDTO extends FeeItemDTO implements Serializable {
    private List<CheckItemDTO> items;
}