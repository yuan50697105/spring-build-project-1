package org.example.modules.repository.mysql.repository;

import org.example.modules.repository.mysql.entity.query.AccountQuery;
import org.example.modules.repository.mysql.entity.result.AccountDetailResult;
import org.example.modules.repository.mysql.entity.vo.AccountFormVo;
import org.example.modules.repository.mysql.entity.result.AccountResult;
import org.example.plugins.mybatis.repository.IBaseRepository;

import java.util.Optional;

public interface AccountRepository extends IBaseRepository<AccountResult, AccountFormVo, AccountDetailResult, AccountQuery> {
    AccountDetailResult getByUsername(String username);

    Optional<AccountDetailResult> getByUsernameOpt(String username);
}
