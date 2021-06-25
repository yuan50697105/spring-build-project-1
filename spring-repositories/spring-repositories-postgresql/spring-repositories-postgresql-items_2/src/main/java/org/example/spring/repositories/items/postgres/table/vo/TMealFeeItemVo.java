package org.example.spring.repositories.items.postgres.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.items.postgres.table.po.TMealFeeItem;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TMealFeeItemVo extends TMealFeeItem implements Serializable {

}