package org.example.spring.applications.web.auth;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.spring.domains.service.AccountService;
import org.example.spring.infrastructures.mysql.auth.entity.query.AccountQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Account;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("account")
@AllArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @GetMapping
    public Result<List<Account>> data(AccountQuery query) {
        IPageData<Account> data = accountService.selectPage(query);
        return R.success(data.getTotalRowNum(), data.getData());
    }

}