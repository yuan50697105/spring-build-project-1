package org.example.spring.applications.auth.web;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.spring.domains.auth.service.AccountService;
import org.example.spring.models.auth.entity.query.AccountQuery;
import org.example.spring.models.auth.entity.result.Account;
import org.example.spring.models.auth.entity.result.AccountDetails;
import org.example.spring.models.auth.entity.vo.AccountFormVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.WebAsyncTask;

import java.util.Collections;
import java.util.List;

@SuppressWarnings("deprecation")
@RestController
@RequestMapping(value = "async/account", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@AllArgsConstructor
public class AsyncAccountController {
    private final AccountService accountService;

    @GetMapping
    public WebAsyncTask<Result<IPageData<Account>>> queryPage(AccountQuery query) {
        return new WebAsyncTask<>(() -> {
            return R.success(accountService.queryPage(query));
        });
    }

    @GetMapping("list/{size}")
    public WebAsyncTask<Result<List<Account>>> queryList(AccountQuery query, @PathVariable int size) {
        return new WebAsyncTask<>(() -> {
            List<Account> data = accountService.queryList((AccountQuery) query.withSize(size));
            return R.success((long) data.size(), data);
        });
    }

    @GetMapping("list")
    public WebAsyncTask<Result<List<Account>>> queryList(AccountQuery query) {
        return new WebAsyncTask<>(() -> {
            List<Account> data = accountService.queryList(query);
            return R.success((long) data.size(), data);
        });
    }

    @GetMapping("one")
    public WebAsyncTask<Result<Account>> queryOne(AccountQuery query) {
        return new WebAsyncTask<>(() -> {
            Account data = accountService.queryOne(query);
            return R.success(data);
        });
    }

    @GetMapping("{id}")
    public WebAsyncTask<Result<AccountDetails>> get(@PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            AccountDetails data = accountService.get(id);
            return R.success(data);
        });
    }

    @PostMapping
    public WebAsyncTask<Result<?>> save(@RequestBody AccountFormVo formVo) {
        return new WebAsyncTask<>(() -> {
            accountService.save(formVo);
            return R.success();
        });
    }

    @PutMapping
    public WebAsyncTask<Result<?>> update(@RequestBody AccountFormVo formVo) {
        return new WebAsyncTask<>(() -> {
            accountService.update(formVo);
            return R.success();
        });
    }

    @PutMapping("{id}")
    public WebAsyncTask<Result<?>> update(@RequestBody AccountFormVo formVo, @PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            accountService.update((AccountFormVo) formVo.withId(id));
            return R.success();
        });
    }


    @DeleteMapping("{id}")
    public WebAsyncTask<Result<?>> delete(@PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            accountService.delete(Collections.singletonList(id));
            return R.success();
        });
    }

    @DeleteMapping
    public WebAsyncTask<Result<?>> delete(List<Long> ids) {
        return new WebAsyncTask<>(() -> {
            accountService.delete(ids);
            return R.success();
        });
    }


}