package org.example.spring.daos.postgresql.patient.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.daos.postgresql.patient.table.po.TPatientTeamMealFeeItem;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TPatientTeamMealFeeItemMapper extends IBaseMapper<TPatientTeamMealFeeItem> {
}