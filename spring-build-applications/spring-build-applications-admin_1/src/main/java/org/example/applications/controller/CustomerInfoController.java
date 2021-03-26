package org.example.applications.controller;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.domains.service.CustomerInfoService;
import org.example.modules.repository.mysql.entity.query.CustomerInfoQuery;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoFormVo;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoVo;
import org.example.plugins.mybatis.entity.IPageData;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer/info")
@AllArgsConstructor
public class CustomerInfoController {
    private final CustomerInfoService customerInfoService;

    @GetMapping
    public Result<List<CustomerInfoVo>> page(CustomerInfoQuery query) {
        IPageData<CustomerInfoVo> data = customerInfoService.page(query);
        return R.success(data.getTotalRowNum(), data.getData());
    }

    @GetMapping("list")
    public Result<List<CustomerInfoVo>> list(CustomerInfoQuery query) {
        return R.success(customerInfoService.list(query));
    }


    @PostMapping
    public Result<?> save(@Validated @RequestBody CustomerInfoFormVo customerInfoFormVo) {
        customerInfoService.save(customerInfoFormVo);
        return R.success();
    }

    @PutMapping("{id}")
    public Result<?> update1(@PathVariable Long id, @RequestBody @Validated CustomerInfoFormVo customerInfoFormVo) {
        customerInfoService.update1(id, customerInfoFormVo);
        return R.success();
    }

    @PutMapping
    public Result<?> update2(@RequestBody @Validated CustomerInfoFormVo customerInfoFormVo) {
        customerInfoService.update2(customerInfoFormVo);
        return R.success();
    }

    @GetMapping("{id}")
    public Result<CustomerInfoVo> get(@PathVariable Long id) {
        return R.success(customerInfoService.get(id));
    }
}