package org.example.spring.infrastructures.postgresql.patient.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.infrastructures.postgresql.patient.table.po.TPatientCheckItem;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TPatientCheckItemMapper extends IBaseMapper<TPatientCheckItem> {
}