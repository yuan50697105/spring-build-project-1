package org.example.applications.controller;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import org.example.domains.service.AccountService;
import org.example.modules.repository.mysql.entity.vo.AccountFormVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping
    public Result<?> add(@Validated @RequestBody AccountFormVo accountFormVo) {
        accountService.save(accountFormVo);
        return R.success();
    }

}