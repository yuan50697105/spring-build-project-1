package org.example.spring.applications.web.auth.controller;


import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.spring.applications.web.auth.entity.PhoneMessageDTO;
import org.example.spring.applications.web.auth.service.AAccountService;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.auth.dto.UserDTO;
import org.example.spring.repositories.commons.auth.query.UserQuery;
import org.example.spring.repositories.commons.auth.vo.UserVo;
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
    public Result<IPageData<UserDTO>> queryPage(UserQuery query) {
        IPageData<UserDTO> data = accountService.queryPage(query);
        return R.success(data.getTotalRowNum(), data);
    }

    @GetMapping("list/{size}")
    public Result<List<UserDTO>> queryList(UserQuery query, @PathVariable int size) {
        List<UserDTO> data = accountService.queryList((UserQuery) query.withSize(size));
        return R.success((long) data.size(), data);
    }

    @GetMapping("list")
    public Result<List<UserDTO>> queryList(UserQuery query) {
        List<UserDTO> data = accountService.queryList(query);
        return R.success((long) data.size(), data);
    }

    @GetMapping("one")
    public Result<UserDTO> queryOne(UserQuery query) {
        UserDTO data = accountService.queryOne(query);
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
        accountService.updateStatus(status, Collections.singletonList(id));
        return R.success();
    }

    @PutMapping(value = "status/{status}", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public Result<?> updateStatus1(@PathVariable String status,@RequestParam List<Long> ids) {
        accountService.updateStatus(status, ids);
        return R.success();
    }

    @PutMapping(value = "status/{status}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result<?> updateStatus2(@PathVariable String status,@RequestBody List<Long> ids) {
        accountService.updateStatus(status, ids);
        return R.success();
    }

    @PostMapping("message/send")
    public Result<?> sendMessage(@RequestBody PhoneMessageDTO phoneMessageDTO) {
        accountService.sendMessage(phoneMessageDTO);
        return R.success();
    }

}