package test;

import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class UserDaoImpl extends TkBaseDaoImpl<User, UserQuery, UserMapper> implements UserDao {
}