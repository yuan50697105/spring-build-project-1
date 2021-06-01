package org.example.spring.repositories.mysql.customer.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.customer.table.po.TSellerInfo;
import org.example.spring.repositories.mysql.customer.table.po.TSellerInfo;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TSellerInfoDTO extends TSellerInfo implements Serializable {
}