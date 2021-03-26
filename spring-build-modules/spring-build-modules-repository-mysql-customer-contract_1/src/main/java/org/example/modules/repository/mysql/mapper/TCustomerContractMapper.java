package org.example.modules.repository.mysql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.modules.repository.mysql.entity.po.TCustomerContract;
import org.example.plugins.mybatis.mapper.IBaseMapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface TCustomerContractMapper extends IBaseMapper<TCustomerContract> {
}