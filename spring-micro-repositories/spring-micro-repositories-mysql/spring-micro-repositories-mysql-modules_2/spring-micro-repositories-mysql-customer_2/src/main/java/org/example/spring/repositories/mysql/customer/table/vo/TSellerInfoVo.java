package org.example.spring.repositories.mysql.customer.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.customer.table.po.TSellerInfo;
import org.example.spring.repositories.mysql.customer.table.po.TSellerInfo;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TSellerInfoVo extends TSellerInfo implements Serializable {
}