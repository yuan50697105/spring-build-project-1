package org.example.spring.applications.auth.web;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import io.reactivex.rxjava3.core.Single;
import lombok.AllArgsConstructor;
import org.example.spring.domains.auth.service.AccountService;
import org.example.spring.models.auth.entity.query.AccountQuery;
import org.example.spring.models.auth.entity.result.Account;
import org.example.spring.models.auth.entity.result.AccountDetails;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rx/account")
@AllArgsConstructor
public class RxAccountController {
    private final AccountService accountService;

    @GetMapping("dataGrid")
    public Single<Result<IPageData<Account>>> selectPage(AccountQuery query) {
        return Single.fromCallable(() -> R.success(accountService.queryPage(query))).cache();
    }

    @GetMapping("list")
    public Single<Result<List<Account>>> selectList(AccountQuery query) {
        return Single.fromCallable(() -> R.success(accountService.queryList(query))).cache();
    }

    @GetMapping("list/{size}")
    public Single<Result<List<Account>>> selectList(AccountQuery query, @PathVariable int size) {
        return Single.fromCallable(() -> R.success(accountService.queryList((AccountQuery) query.withSize(size)))).cache();
    }

    @GetMapping("one")
    public Single<Result<Account>> selectOne(AccountQuery query) {
        return Single.fromCallable(() -> R.success(accountService.queryOne(query))).cache();
    }

    @GetMapping("{id}")
    public Single<Result<AccountDetails>> get(@PathVariable Long id) {
        return Single.fromCallable(() -> R.success(accountService.get(id))).cache();
    }

}