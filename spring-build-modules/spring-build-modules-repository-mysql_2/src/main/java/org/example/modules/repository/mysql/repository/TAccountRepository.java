package org.example.modules.repository.mysql.repository;

import org.example.modules.repository.mysql.entity.query.TAccountQuery;
import org.example.modules.repository.mysql.entity.vo.TAccountVo;
import org.example.plugins.mybatis.repository.IBaseRepository;

public interface TAccountRepository extends IBaseRepository<TAccountVo, TAccountVo, TAccountQuery> {
}
