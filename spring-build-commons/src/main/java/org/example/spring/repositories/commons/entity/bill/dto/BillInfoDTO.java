package org.example.spring.repositories.commons.entity.bill.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.entity.bill.po.BillInfo;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class BillInfoDTO extends BillInfo implements Serializable {

}