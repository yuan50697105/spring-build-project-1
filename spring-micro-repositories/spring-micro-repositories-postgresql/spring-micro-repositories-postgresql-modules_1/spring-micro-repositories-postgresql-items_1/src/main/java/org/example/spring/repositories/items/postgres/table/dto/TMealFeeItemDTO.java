package org.example.spring.repositories.items.postgres.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TMealFeeItemDTO extends org.example.spring.repositories.items.postgres.table.dto.TMealDTO implements Serializable {
    private List<org.example.spring.repositories.items.postgres.table.dto.TFeeItemDTO> items;
}