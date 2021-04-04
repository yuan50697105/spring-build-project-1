package org.example.modules.repository.mysql.entity.result;

import lombok.Data;
import org.example.modules.repository.mysql.table.po.TMealInfo;

@Data
public class MealInfoDetails {
    private TMealInfo meal;
}