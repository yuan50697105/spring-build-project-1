package org.example.spring.models.clickhouse.auth.repository;

import org.example.spring.models.clickhouse.auth.entity.query.AccountQuery;
import org.example.spring.models.clickhouse.auth.entity.result.Account;
import org.example.spring.models.clickhouse.auth.entity.result.AccountDetails;
import org.example.spring.models.clickhouse.auth.entity.vo.AccountModelVo;
import org.example.spring.models.commons.enumerate.UserStatus;
import org.example.spring.models.commons.repository.IBaseRepository;

import java.util.List;

public interface AccountRepository extends IBaseRepository<Account, AccountModelVo, AccountDetails, AccountQuery> {
    void updateStatusByIds(UserStatus status, List<Long> ids);
}