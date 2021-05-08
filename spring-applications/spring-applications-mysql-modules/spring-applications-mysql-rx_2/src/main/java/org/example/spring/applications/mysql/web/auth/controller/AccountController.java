package org.example.spring.applications.mysql.web.auth.controller;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Single;
import lombok.AllArgsConstructor;
import org.example.spring.applications.web.auth.service.AAccountService;
import org.example.spring.models.mysql.auth.entity.query.AccountQuery;
import org.example.spring.models.mysql.auth.entity.result.Account;
import org.example.spring.models.mysql.auth.entity.result.AccountDetails;
import org.example.spring.models.mysql.auth.entity.vo.AccountModelVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@SuppressWarnings("deprecation")
@RestController
@RequestMapping(value = "account", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@AllArgsConstructor
public class AccountController {
    private final AAccountService accountService;

    @GetMapping
    public @NonNull Single<Result<IPageData<Account>>> queryPage(AccountQuery query) {
        return Single.fromCallable(() -> {
            IPageData<Account> data = accountService.queryPage(query);
            return R.success(data.getTotalRowNum(), data);
        });
    }

    @GetMapping("list/{size}")
    public @NonNull Single<Result<List<Account>>> queryList(AccountQuery query, @PathVariable int size) {
        return Single.fromCallable(() -> {
            List<Account> data = accountService.queryList((AccountQuery) query.withSize(size));
            return R.success((long) data.size(), data);

        });
    }

    @GetMapping("list")
    public @NonNull Single<Result<List<Account>>> queryList(AccountQuery query) {
        return Single.fromCallable(() -> {
            List<Account> data = accountService.queryList(query);
            return R.success((long) data.size(), data);

        });
    }

    @GetMapping("one")
    public @NonNull Single<Result<Account>> queryOne(AccountQuery query) {
        return Single.fromCallable(() -> {
            Account data = accountService.queryOne(query);
            return R.success(data);
        });
    }

    @GetMapping("{id}")
    public @NonNull Single<Result<AccountDetails>> get(@PathVariable Long id) {
        return Single.fromCallable(() -> {
            AccountDetails data = accountService.get(id);
            return R.success(data);

        });
    }

    @PostMapping
    public @NonNull Single<Result<?>> save(@RequestBody AccountModelVo formVo) {
        return Single.fromCallable(() -> {
            accountService.save(formVo);
            return R.success();

        });
    }

    @PutMapping
    public @NonNull Single<Result<?>> update(@RequestBody AccountModelVo formVo) {
        return Single.fromCallable(() -> {
            accountService.update(formVo);
            return R.success();
        });
    }

    @PutMapping("{id}")
    public @NonNull Single<Result<?>> update(@RequestBody AccountModelVo formVo, @PathVariable Long id) {
        return Single.fromCallable(() -> {
            accountService.update((AccountModelVo) formVo.withId(id));
            return R.success();

        });
    }


    @DeleteMapping("{id}")
    public @NonNull Single<Result<?>> delete(@PathVariable Long id) {
        return Single.fromCallable(() -> {
            accountService.delete(Collections.singletonList(id));
            return R.success();
        });
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public @NonNull Single<Result<?>> delete1(@RequestParam List<Long> ids) {
        return Single.fromCallable(() -> {
            accountService.delete(ids);
            return R.success();
        });
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public @NonNull Single<Result<?>> delete2(@RequestBody List<Long> ids) {
        return Single.fromCallable(() -> {
            accountService.delete(ids);
            return R.success();
        });
    }

    @PutMapping("status/{status}/{id}")
    public @NonNull Single<Result<?>> updateStatus(@PathVariable String status, @PathVariable Long id) {
        return Single.fromCallable(() -> {
            accountService.updateStatus(status, Collections.singletonList(id));
            return R.success();
        });
    }

    @PutMapping(value = "status/{status}", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public @NonNull Single<Result<?>> updateStatus1(@PathVariable String status, @RequestParam List<Long> ids) {
        return Single.fromCallable(() -> {
            accountService.updateStatus(status, ids);
            return R.success();
        });
    }

    @PutMapping(value = "status/{status}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public @NonNull Single<Result<?>> updateStatus2(@PathVariable String status, @RequestBody List<Long> ids) {
        return Single.fromCallable(() -> {
            accountService.updateStatus(status, ids);
            return R.success();
        });
    }

}