package org.example.spring.repositories.oracle.items.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TMealFeeItemDTO extends org.example.spring.repositories.oracle.items.table.dto.TMealDTO implements Serializable {
    private List<org.example.spring.repositories.oracle.items.table.dto.TFeeItemDTO> items;
}