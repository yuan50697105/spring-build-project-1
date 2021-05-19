package org.example.spring.daos.mysql.auth.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.spring.daos.mysql.auth.table.po.TRole;

import java.util.List;

@Mapper
public interface TRoleQueryMapper {
    List<TRole> queryListByUserId(@Param("userId") Long userId);
}
