package org.example.modules.repository.mysql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.modules.repository.mysql.table.po.TCustomerGroupItem;
import org.example.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface TCustomerGroupItemMapper extends IBaseMapper<TCustomerGroupItem> {
}
