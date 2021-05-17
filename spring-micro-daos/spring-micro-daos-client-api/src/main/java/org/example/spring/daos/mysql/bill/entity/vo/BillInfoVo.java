package org.example.spring.daos.mysql.bill.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.bill.entity.po.BillInfo;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class BillInfoVo extends BillInfo implements Serializable {
}