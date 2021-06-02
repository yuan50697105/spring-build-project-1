package org.example.spring.repositories.oracle.customer.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.oracle.customer.table.po.TSalesRecord;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TSalesRecordDTO extends TSalesRecord implements Serializable {
}