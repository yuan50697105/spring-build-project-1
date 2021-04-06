package org.example.modules.repository.mysql.entity.result;

import lombok.Data;
import org.example.modules.repository.mysql.table.po.TMealInfo;

import java.util.List;

@Data
public class MealInfoDetails {
    private TMealInfo meal;
    private List<MealItem> items;
}