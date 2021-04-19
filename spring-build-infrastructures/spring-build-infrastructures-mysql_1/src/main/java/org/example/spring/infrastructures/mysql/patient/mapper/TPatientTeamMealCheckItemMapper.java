package org.example.spring.infrastructures.mysql.patient.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientTeamMealCheckItem;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TPatientTeamMealCheckItemMapper extends IBaseMapper<TPatientTeamMealCheckItem> {
}