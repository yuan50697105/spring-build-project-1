package org.example.spring.models.mysql.auth.repository;

import org.example.spring.models.commons.enumerate.UserStatus;
import org.example.spring.models.commons.repository.IBaseRepository;
import org.example.spring.models.mysql.auth.entity.query.AccountQuery;
import org.example.spring.models.mysql.auth.entity.result.Account;
import org.example.spring.models.mysql.auth.entity.result.AccountDetails;
import org.example.spring.models.mysql.auth.entity.vo.AccountModelVo;

import java.util.List;

public interface AccountRepository extends IBaseRepository<Account, AccountModelVo, AccountDetails, AccountQuery> {
    void updateStatus(UserStatus status, List<Long> ids);
}
