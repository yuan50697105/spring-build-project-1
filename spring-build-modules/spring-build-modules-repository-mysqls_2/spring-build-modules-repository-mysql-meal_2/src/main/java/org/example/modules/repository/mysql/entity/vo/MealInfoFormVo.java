package org.example.modules.repository.mysql.entity.vo;

import lombok.Data;

import java.util.List;

@Data
public class MealInfoFormVo {
    private MealInfoVo meal;
    private List<MealItemVo> items;

}