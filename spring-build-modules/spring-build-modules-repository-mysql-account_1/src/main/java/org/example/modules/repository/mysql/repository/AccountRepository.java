package org.example.modules.repository.mysql.repository;

import org.example.modules.repository.mysql.entity.query.AccountQuery;
import org.example.modules.repository.mysql.entity.vo.AccountDetailVo;
import org.example.modules.repository.mysql.entity.vo.AccountFormVo;
import org.example.modules.repository.mysql.entity.vo.AccountVo;
import org.example.plugins.mybatis.repository.IBaseRepository;

import java.util.Optional;

public interface AccountRepository extends IBaseRepository<AccountVo, AccountFormVo, AccountDetailVo, AccountQuery> {
    AccountDetailVo getByUsername(String username);

    Optional<AccountDetailVo> getByUsernameOpt(String username);
}
