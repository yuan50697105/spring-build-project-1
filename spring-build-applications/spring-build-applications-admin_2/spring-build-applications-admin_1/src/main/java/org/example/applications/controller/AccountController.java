package org.example.applications.controller;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.domains.service.AccountService;
import org.example.modules.repository.mysql.entity.query.AccountQuery;
import org.example.modules.repository.mysql.entity.result.AccountDetails;
import org.example.modules.repository.mysql.entity.result.Account;
import org.example.modules.repository.mysql.entity.vo.AccountFormVo;
import org.example.plugins.mybatis.entity.IPageData;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("account")
@AllArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @GetMapping
    public Result<List<Account>> page(AccountQuery query) {
        IPageData<Account> data = accountService.page(query);
        return R.success(data.getTotalRowNum(), data.getData());
    }

    @PostMapping
    public Result<?> save(@Validated @RequestBody AccountFormVo accountFormVo) {
        accountService.save(accountFormVo);
        return R.success();
    }

    @PutMapping("{id}")
    public Result<?> update(@PathVariable Long id, @Validated @RequestBody AccountFormVo formVo) {
        accountService.update(id, formVo);
        return R.success();
    }

    @PutMapping
    public Result<?> update(@Validated @RequestBody AccountFormVo formVo) {
        accountService.update(formVo);
        return R.success();
    }

    @GetMapping("{id}")
    public Result<AccountDetails> get(@PathVariable Long id) {
        return R.success(accountService.get(id));
    }

}