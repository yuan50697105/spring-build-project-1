package org.example.spring.infrastructures.mysql.patient.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientGroup;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TPatientGroupItemMapper extends IBaseMapper<TPatientGroup> {
}