package org.example.spring.daos.postgres.bill.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TBillSubInfoDetailsDTO extends TBillSubInfoDTO implements Serializable {
    private List<TBillItemsInfoDTO> items;
}