package org.example.spring.repositories.postgres.items.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TFeeCheckItemDTO extends TFeeItemDTO implements Serializable {
    private List<TCheckItemDTO> items;
}