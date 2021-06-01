package org.example.spring.repositories.mssql.customer.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.mssql.customer.table.po.TSalesRecord;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TSalesRecordVo extends TSalesRecord implements Serializable {
}