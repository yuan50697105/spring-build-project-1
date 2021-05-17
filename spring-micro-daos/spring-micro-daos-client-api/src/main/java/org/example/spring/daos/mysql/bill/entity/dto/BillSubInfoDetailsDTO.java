package org.example.spring.daos.mysql.bill.entity.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class BillSubInfoDetailsDTO extends BillSubInfoDTO implements Serializable {
    private List<BillItemsInfoDTO> items;
}