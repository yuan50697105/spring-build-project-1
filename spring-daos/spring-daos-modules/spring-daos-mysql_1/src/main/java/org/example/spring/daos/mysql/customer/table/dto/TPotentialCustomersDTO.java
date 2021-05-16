package org.example.spring.daos.mysql.customer.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.customer.table.po.TPotentialCustomers;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPotentialCustomersDTO extends TPotentialCustomers implements Serializable {
}