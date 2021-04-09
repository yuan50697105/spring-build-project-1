package org.example.spring.applications.web.auth;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.spring.domains.service.AccountService;
import org.example.spring.infrastructures.mysql.auth.entity.query.AccountQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Account;
import org.example.spring.infrastructures.mysql.auth.entity.result.AccountDetails;
import org.example.spring.infrastructures.mysql.auth.entity.vo.AccountFormVo;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@SuppressWarnings("deprecation")
@RestController
@RequestMapping(value = "account", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@AllArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @GetMapping
    public Result<List<Account>> queryPage(AccountQuery query) {
        IPageData<Account> data = accountService.queryPage(query);
        return R.success(data.getTotalRowNum(), data.getData());
    }

    @GetMapping("list")
    public Result<List<Account>> queryList(AccountQuery query) {
        List<Account> data = accountService.queryList(query);
        return R.success((long) data.size(), data);
    }

    @GetMapping("top")
    public Result<List<Account>> queryTop(AccountQuery query) {
        List<Account> data = accountService.queryTop(query);
        return R.success((long) data.size(), data);
    }

    @GetMapping("first")
    public Result<Account> queryFirst(AccountQuery query) {
        Account data = accountService.queryFirst(query);
        return R.success(data);
    }

    @GetMapping("one")
    public Result<Account> queryOne(AccountQuery query) {
        return R.success(accountService.queryOne(query));
    }

    @GetMapping("{id}")
    public Result<AccountDetails> get(@PathVariable Long id) {
        return R.success(accountService.get(id));
    }

    @PostMapping
    public Result<?> save(@RequestBody AccountFormVo formVo) {
        accountService.save(formVo);
        return R.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody AccountFormVo formVo) {
        accountService.update(formVo);
        return R.success();
    }

    @PutMapping("{id}")
    public Result<?> update(@RequestBody AccountFormVo formVo, @PathVariable Long id) {
        formVo.setId(id);
        accountService.update(formVo);
        return R.success();
    }


    @DeleteMapping("{id}")
    public Result<?> delete(@PathVariable Long id) {
        accountService.delete(Collections.singletonList(id));
        return R.success();
    }

    @DeleteMapping
    public Result<?> delete(List<Long> ids) {
        accountService.delete(ids);
        return R.success();
    }


}