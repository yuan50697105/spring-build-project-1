package org.example.spring.infrastructures.mysql.auth.repository;

import org.example.spring.infrastructures.mysql.auth.entity.query.AccountQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Account;
import org.example.spring.infrastructures.mysql.auth.entity.result.AccountDetails;
import org.example.spring.infrastructures.mysql.auth.entity.vo.AccountFormVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface AccountRepository extends IBaseRepository<Account, AccountFormVo, AccountDetails, AccountQuery> {
}
