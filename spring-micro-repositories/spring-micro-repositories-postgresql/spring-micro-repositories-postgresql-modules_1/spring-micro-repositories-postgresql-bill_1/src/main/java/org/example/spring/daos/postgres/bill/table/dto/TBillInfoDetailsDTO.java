package org.example.spring.daos.postgres.bill.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TBillInfoDetailsDTO extends TBillInfoDTO implements Serializable {
    private List<TBillSubInfoDetailsDTO> subs;
}