package org.example.spring.repositories.bill.oracle.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.bill.oracle.table.po.TBillInfo;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TBillInfoDTO extends TBillInfo implements Serializable {

}