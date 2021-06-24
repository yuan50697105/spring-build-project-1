package org.example.spring.applications.web.auth.controller;


import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.spring.domains.services.auth.mysql.service.DAccountService;
import org.example.spring.domains.services.auth.mysql.vo.RegisterVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.entity.auth.dto.UserDTO;
import org.example.spring.repositories.commons.entity.auth.query.UserQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;
import org.example.spring.repositories.commons.enumerate.UserStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@SuppressWarnings("deprecation")
@RestController
@RequestMapping(value = "account", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@AllArgsConstructor
public class AccountController {
    private final DAccountService accountService;

    @GetMapping
    public Result<IPageData<UserDTO>> queryPage(UserQuery query) {
        IPageData<UserDTO> data = accountService.data(query);
        return R.success(data.getTotalRowNum(), data);
    }

    @GetMapping("list/{size}")
    public Result<List<UserDTO>> queryList(UserQuery query, @PathVariable int size) {
        List<UserDTO> data = accountService.top((UserQuery) query.withSize(size));
        return R.success((long) data.size(), data);
    }

    @GetMapping("list")
    public Result<List<UserDTO>> queryList(UserQuery query) {
        List<UserDTO> data = accountService.list(query);
        return R.success((long) data.size(), data);
    }

    @GetMapping("one")
    public Result<UserDTO> queryOne(UserQuery query) {
        UserDTO data = accountService.one(query);
        return R.success(data);
    }

    @GetMapping("{id}")
    public Result<UserDTO> get(@PathVariable Long id) {
        UserDTO data = accountService.get(id);
        return R.success(data);
    }

    @PostMapping
    public Result<?> save(@RequestBody UserVo formVo) {
        accountService.save(formVo);
        return R.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody UserVo formVo) {
        accountService.update(formVo);
        return R.success();
    }

    @PutMapping("{id}")
    public Result<?> update(@RequestBody UserVo formVo, @PathVariable Long id) {
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

    @PutMapping("status/{status}/{id}")
    public Result<?> updateStatus(@PathVariable String status, @PathVariable Long id) {
        accountService.updateStatus(UserStatus.get(status), Collections.singletonList(id));
        return R.success();
    }

    @PutMapping(value = "status/{status}", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public Result<?> updateStatus1(@PathVariable String status, @RequestParam List<Long> ids) {
        accountService.updateStatus(UserStatus.get(status), ids);
        return R.success();
    }

    @PutMapping(value = "status/{status}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result<?> updateStatus2(@PathVariable String status, @RequestBody List<Long> ids) {
        accountService.updateStatus(UserStatus.get(status), ids);
        return R.success();
    }

    @PostMapping("register/{type}")
    public Result<?> register(@RequestBody UserVo userVo, @PathVariable String type) {
        return accountService.register(new RegisterVo(userVo, RegisterVo.RegisterType.get(type)));
    }

    @PostMapping("register/admin")
    public Result<?> registerAdmin(@RequestBody UserVo userVo) {
        return accountService.register(new RegisterVo(userVo, RegisterVo.RegisterType.ADMIN_USER));
    }

    @PostMapping("register/sell")
    public Result<?> registerSell(@RequestBody UserVo userVo) {
        return accountService.register(new RegisterVo(userVo, RegisterVo.RegisterType.SELL_USER));
    }

    @GetMapping("verify/account/exist")
    public Result<?> verifyAccountExist(UserVo userVo) {
        return accountService.verifyAccountExists(new RegisterVo(userVo));
    }

}