package org.example.applications.controller;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.domains.service.AccountService;
import org.example.modules.repository.mysql.entity.vo.AccountFormVo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("account")
@AllArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @PostMapping
    public Result<?> save(@Validated @RequestBody AccountFormVo accountFormVo) {
        accountService.save(accountFormVo);
        return R.success();
    }

    @PutMapping("{id}")
    public Result<?> update1(@PathVariable Long id, @Validated @RequestBody AccountFormVo formVo) {
        accountService.update(id, formVo);
        return R.success();
    }

    @PutMapping
    public Result<?> update2(@Validated @RequestBody AccountFormVo formVo) {
        accountService.update(formVo);
        return R.success();
    }

}