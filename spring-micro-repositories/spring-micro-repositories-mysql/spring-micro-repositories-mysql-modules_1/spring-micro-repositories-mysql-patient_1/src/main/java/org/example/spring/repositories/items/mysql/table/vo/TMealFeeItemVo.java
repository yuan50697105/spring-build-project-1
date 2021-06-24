package org.example.spring.repositories.items.mysql.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.items.mysql.table.po.TMealFeeItem;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TMealFeeItemVo extends TMealFeeItem implements Serializable {

}