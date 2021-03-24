package org.example.modules.repository.mysql.repository;

import org.example.modules.repository.mysql.entity.query.TAccountQuery;
import org.example.modules.repository.mysql.entity.vo.AccountVo;
import org.example.plugins.mybatis.repository.IBaseRepository;

public interface TAccountRepository extends IBaseRepository<AccountVo, AccountVo, TAccountQuery> {
}
