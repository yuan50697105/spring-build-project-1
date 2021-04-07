package org.example.spring.infrastructures.mysql.customer.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.customer.table.po.TCustomerInfo;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerVo extends TCustomerInfo {
}