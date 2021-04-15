package org.example.spring.models.auth.repository;

import org.example.spring.models.auth.entity.query.AccountQuery;
import org.example.spring.models.auth.entity.result.Account;
import org.example.spring.models.auth.entity.result.AccountDetails;
import org.example.spring.models.auth.entity.vo.AccountFormVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface AccountRepository extends IBaseRepository<Account, AccountFormVo, AccountDetails, AccountQuery> {
}
