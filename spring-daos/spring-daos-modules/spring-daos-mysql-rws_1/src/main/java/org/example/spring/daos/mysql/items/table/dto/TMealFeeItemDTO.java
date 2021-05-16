package org.example.spring.daos.mysql.items.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TMealFeeItemDTO extends TMealDTO implements Serializable {
    private List<TFeeItemDTO> items;
}