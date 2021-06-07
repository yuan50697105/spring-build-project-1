package org.example.spring.repositories.commons.entity.customer.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.entity.customer.po.SalesRecord;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class SalesRecordVo extends SalesRecord implements Serializable {
}