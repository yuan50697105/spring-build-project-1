package org.example.spring.daos.mysql.items.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.items.table.po.TMealFeeItem;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TMealFeeItemVo extends TMealFeeItem implements Serializable {

}