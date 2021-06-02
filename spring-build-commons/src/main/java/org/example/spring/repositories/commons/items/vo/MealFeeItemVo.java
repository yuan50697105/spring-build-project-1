package org.example.spring.repositories.commons.items.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.items.po.MealFeeItem;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class MealFeeItemVo extends MealFeeItem implements Serializable {

}