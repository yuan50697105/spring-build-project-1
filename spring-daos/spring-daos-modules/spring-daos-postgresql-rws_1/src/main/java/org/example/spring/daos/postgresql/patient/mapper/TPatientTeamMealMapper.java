package org.example.spring.daos.postgresql.patient.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.daos.postgresql.patient.table.po.TPatientTeamMeal;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TPatientTeamMealMapper extends IBaseMapper<TPatientTeamMeal> {
}