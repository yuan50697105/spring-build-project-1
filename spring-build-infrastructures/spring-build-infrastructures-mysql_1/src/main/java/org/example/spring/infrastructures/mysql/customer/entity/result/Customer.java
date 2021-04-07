package org.example.spring.infrastructures.mysql.customer.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.customer.table.po.TCustomerInfo;

@EqualsAndHashCode(callSuper = true)
@Data
public class Customer extends TCustomerInfo {
}