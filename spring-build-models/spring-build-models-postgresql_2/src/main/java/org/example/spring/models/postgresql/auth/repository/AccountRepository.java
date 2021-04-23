package org.example.spring.models.postgresql.auth.repository;

import org.example.spring.models.commons.enumerate.UserStatus;
import org.example.spring.models.commons.repository.IBaseRepository;
import org.example.spring.models.postgresql.auth.entity.query.AccountQuery;
import org.example.spring.models.postgresql.auth.entity.result.Account;
import org.example.spring.models.postgresql.auth.entity.result.AccountDetails;
import org.example.spring.models.postgresql.auth.entity.vo.AccountModelVo;

import java.util.List;

public interface AccountRepository extends IBaseRepository<Account, AccountModelVo, AccountDetails, AccountQuery> {
    void updateStatusByIds(UserStatus status, List<Long> ids);
}
