package org.example.spring.repositories.commons.entity.customer.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.entity.customer.po.PotentialCustomers;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class PotentialCustomersVo extends PotentialCustomers implements Serializable {

}