package org.example.spring.infrastructures.postgresql.auth.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TUserMapper {
    boolean existByUsername(String username);
}