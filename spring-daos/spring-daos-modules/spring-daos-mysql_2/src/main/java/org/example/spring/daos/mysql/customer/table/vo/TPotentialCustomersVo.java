package org.example.spring.daos.mysql.customer.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.customer.table.po.TPotentialCustomers;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPotentialCustomersVo extends TPotentialCustomers implements Serializable {

}