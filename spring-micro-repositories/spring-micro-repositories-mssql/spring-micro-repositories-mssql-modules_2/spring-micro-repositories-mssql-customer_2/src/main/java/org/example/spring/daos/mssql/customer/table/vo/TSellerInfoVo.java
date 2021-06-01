package org.example.spring.daos.mssql.customer.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mssql.customer.table.po.TSellerInfo;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TSellerInfoVo extends TSellerInfo implements Serializable {
}