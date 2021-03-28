package org.example.modules.repository.mysql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.modules.repository.mysql.entity.po.VCustomerGroupInfo;
import org.example.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface VCustomerGroupInfoMapper extends IBaseMapper<VCustomerGroupInfo> {
}