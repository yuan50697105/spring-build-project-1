package org.example.modules.repository.mysql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.modules.repository.mysql.table.po.TCustomerPatient;
import org.example.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TCustomerPatientMapper extends IBaseMapper<TCustomerPatient> {
}