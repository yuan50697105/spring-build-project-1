package org.example.modules.repository.mysql.account.repository;

import org.example.modules.repository.mysql.account.entity.query.TAccountQuery;
import org.example.modules.repository.mysql.account.entity.vo.TAccountVo;
import org.example.plugins.mybatis.repository.IBaseRepository;

public interface TAccountRepository extends IBaseRepository<TAccountVo, TAccountVo, TAccountQuery> {
}
