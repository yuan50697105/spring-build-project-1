package org.example.spring.daos.postgresql.patient.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.spring.daos.postgresql.patient.table.po.TPatientGroup;
import org.example.spring.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TPatientGroupMapper extends IBaseMapper<TPatientGroup> {
    boolean existById(Long id);
}