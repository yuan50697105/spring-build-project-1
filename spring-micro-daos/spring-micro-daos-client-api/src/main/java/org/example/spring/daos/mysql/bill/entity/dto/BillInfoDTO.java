package org.example.spring.daos.mysql.bill.entity.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.bill.entity.po.BillInfo;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class BillInfoDTO extends BillInfo implements Serializable {
}