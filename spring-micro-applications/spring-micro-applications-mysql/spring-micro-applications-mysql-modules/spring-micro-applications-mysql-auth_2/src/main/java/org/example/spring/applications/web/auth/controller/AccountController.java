package org.example.spring.applications.web.auth.controller;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.spring.applications.web.auth.entity.PhoneMessageDTO;
import org.example.spring.applications.web.auth.service.AAccountService;
import org.example.spring.repositories.mysql.auth.table.dto.TUserDTO;
import org.example.spring.repositories.mysql.auth.table.query.TUserQuery;
import org.example.spring.repositories.mysql.auth.table.vo.TUserVo;
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
    public Result<IPageData<TUserDTO>> queryPage(TUserQuery query) {
        IPageData<TUserDTO> data = accountService.queryPage(query);
        return R.success(data.getTotalRowNum(), data);
    }

    @GetMapping("list/{size}")
    public Result<List<TUserDTO>> queryList(TUserQuery query, @PathVariable int size) {
        List<TUserDTO> data = accountService.queryList((TUserQuery) query.withSize(size));
        return R.success((long) data.size(), data);
    }

    @GetMapping("list")
    public Result<List<TUserDTO>> queryList(TUserQuery query) {
        List<TUserDTO> data = accountService.queryList(query);
        return R.success((long) data.size(), data);
    }

    @GetMapping("one")
    public Result<TUserDTO> queryOne(TUserQuery query) {
        TUserDTO data = accountService.queryOne(query);
        return R.success(data);
    }

    @GetMapping("{id}")
    public Result<TUserDTO> get(@PathVariable Long id) {
        TUserDTO data = accountService.get(id);
        return R.success(data);
    }

    @PostMapping
    public Result<?> save(@RequestBody TUserVo formVo) {
        accountService.save(formVo);
        return R.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody TUserVo formVo) {
        accountService.update(formVo);
        return R.success();
    }

    @PutMapping("{id}")
    public Result<?> update(@RequestBody TUserVo formVo, @PathVariable Long id) {
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