package org.example.modules.repository.mysql.repository;

import org.example.modules.repository.mysql.entity.query.AccountQuery;
import org.example.modules.repository.mysql.entity.result.AccountDetails;
import org.example.modules.repository.mysql.entity.vo.AccountFormVo;
import org.example.modules.repository.mysql.entity.result.Account;
import org.example.plugins.mybatis.repository.IBaseRepository;

import java.util.Optional;

public interface AccountRepository extends IBaseRepository<Account, AccountFormVo, AccountDetails, AccountQuery> {
    AccountDetails getByUsername(String username);

    Optional<AccountDetails> getByUsernameOpt(String username);
}
