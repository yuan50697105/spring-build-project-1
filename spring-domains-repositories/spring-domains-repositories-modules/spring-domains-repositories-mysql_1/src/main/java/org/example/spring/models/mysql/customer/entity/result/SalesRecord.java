package org.example.spring.models.mysql.customer.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.customer.table.po.TSalesRecord;

@EqualsAndHashCode(callSuper = true)
@Data
public class SalesRecord extends TSalesRecord {
}