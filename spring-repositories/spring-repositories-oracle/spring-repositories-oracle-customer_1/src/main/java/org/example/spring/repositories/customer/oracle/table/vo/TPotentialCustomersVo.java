package org.example.spring.repositories.customer.oracle.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.customer.oracle.table.po.TPotentialCustomers;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPotentialCustomersVo extends TPotentialCustomers implements Serializable {

}