package org.example.spring.repositories.commons.customer.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.customer.po.SalesRecord;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class SalesRecordDTO extends SalesRecord implements Serializable {
}