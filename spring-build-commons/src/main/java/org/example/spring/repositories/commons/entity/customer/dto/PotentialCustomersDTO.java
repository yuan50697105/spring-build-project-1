package org.example.spring.repositories.commons.entity.customer.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.entity.customer.po.PotentialCustomers;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class PotentialCustomersDTO extends PotentialCustomers implements Serializable {
}