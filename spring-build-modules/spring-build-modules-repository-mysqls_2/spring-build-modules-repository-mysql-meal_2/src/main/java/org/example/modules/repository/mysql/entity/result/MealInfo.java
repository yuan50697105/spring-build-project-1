package org.example.modules.repository.mysql.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.modules.repository.mysql.table.po.TMealInfo;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class MealInfo extends TMealInfo implements Serializable {
}