package org.example.spring.applications.web.auth.controller;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.spring.applications.web.auth.service.AAccountService;
import org.example.spring.models.mysql.auth.entity.query.AccountQuery;
import org.example.spring.models.mysql.auth.entity.result.Account;
import org.example.spring.models.mysql.auth.entity.result.AccountDetails;
import org.example.spring.models.mysql.auth.entity.vo.AccountModelVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.WebAsyncTask;

import java.util.Collections;
import java.util.List;

@SuppressWarnings("deprecation")
@RestController
@RequestMapping(value = "account", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@AllArgsConstructor
public class AccountController {
    private final AAccountService accountService;

    @GetMapping
    public WebAsyncTask<Result<IPageData<Account>>> queryPage(AccountQuery query) {
        return new WebAsyncTask<>(() -> {
            IPageData<Account> data = accountService.queryPage(query);
            return R.success(data.getTotalRowNum(), data);
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
    public WebAsyncTask<Result<?>> save(@RequestBody AccountModelVo formVo) {
        return new WebAsyncTask<>(() -> {
            accountService.save(formVo);
            return R.success();

        });
    }

    @PutMapping
    public WebAsyncTask<Result<?>> update(@RequestBody AccountModelVo formVo) {
        return new WebAsyncTask<>(() -> {
            accountService.update(formVo);
            return R.success();
        });
    }

    @PutMapping("{id}")
    public WebAsyncTask<Result<?>> update(@RequestBody AccountModelVo formVo, @PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            accountService.update((AccountModelVo) formVo.withId(id));
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

    @DeleteMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public WebAsyncTask<Result<?>> delete1(@RequestParam List<Long> ids) {
        return new WebAsyncTask<>(() -> {
            accountService.delete(ids);
            return R.success();
        });
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public WebAsyncTask<Result<?>> delete2(@RequestBody List<Long> ids) {
        return new WebAsyncTask<>(() -> {
            accountService.delete(ids);
            return R.success();
        });
    }

    @PutMapping("status/{status}/{id}")
    public WebAsyncTask<Result<?>> updateStatus(@PathVariable String status, @PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            accountService.updateStatus(status, Collections.singletonList(id));
            return R.success();
        });
    }

    @PutMapping(value = "status/{status}", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public WebAsyncTask<Result<?>> updateStatus1(@PathVariable String status, @RequestParam List<Long> ids) {
        return new WebAsyncTask<>(() -> {
            accountService.updateStatus(status, ids);
            return R.success();
        });
    }

    @PutMapping(value = "status/{status}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public WebAsyncTask<Result<?>> updateStatus2(@PathVariable String status,@RequestBody List<Long> ids) {
        return new WebAsyncTask<>(() -> {
            accountService.updateStatus(status, ids);
            return R.success();
        });
    }

}