package org.example.spring.daos.mysql.bill.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.bill.entity.po.BillSubInfo;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class BillSubInfoVo extends BillSubInfo implements Serializable {
}