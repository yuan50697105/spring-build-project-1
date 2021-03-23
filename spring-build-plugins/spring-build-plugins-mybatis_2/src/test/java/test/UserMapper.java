package test;

import org.apache.ibatis.annotations.Mapper;
import org.example.plugins.mybatis.dao.TkBaseDao;
import org.example.plugins.mybatis.mapper.IBaseMapper;

@Mapper
public interface UserMapper extends IBaseMapper<User> {
}
