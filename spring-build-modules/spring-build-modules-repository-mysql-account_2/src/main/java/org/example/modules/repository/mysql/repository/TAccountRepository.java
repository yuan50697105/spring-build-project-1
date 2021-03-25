package org.example.modules.repository.mysql.repository;

import org.example.modules.repository.mysql.entity.query.AccountQuery;
import org.example.modules.repository.mysql.entity.vo.AccountDetailVo;
import org.example.modules.repository.mysql.entity.vo.AccountFormVo;
import org.example.modules.repository.mysql.entity.vo.AccountVo;
import org.example.plugins.mybatis.repository.IBaseRepository;

public interface TAccountRepository extends IBaseRepository<AccountVo, AccountFormVo, AccountDetailVo, AccountQuery> {
}
