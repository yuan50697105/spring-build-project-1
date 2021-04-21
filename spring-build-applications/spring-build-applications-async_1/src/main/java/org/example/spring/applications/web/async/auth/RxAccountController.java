package org.example.spring.applications.web.async.auth;

import io.reactivex.rxjava3.core.Single;
import lombok.AllArgsConstructor;
import org.example.spring.domains.auth.service.AccountService;
import org.example.spring.models.auth.entity.query.AccountQuery;
import org.example.spring.models.auth.entity.result.Account;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rx/account")
@AllArgsConstructor
public class RxAccountController {
    private final AccountService accountService;

    @GetMapping
    public Single<IPageData<Account>> selectPage(AccountQuery query) {
        return Single.fromCallable(() -> {
            return accountService.queryPage(query);
        });
    }
}