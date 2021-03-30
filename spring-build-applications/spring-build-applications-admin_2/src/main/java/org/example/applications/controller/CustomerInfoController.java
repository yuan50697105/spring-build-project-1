package org.example.applications.controller;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.domains.service.CustomerInfoService;
import org.example.modules.repository.mysql.entity.query.CustomerInfoQuery;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoFormVo;
import org.example.modules.repository.mysql.entity.result.CustomerInfo;
import org.example.plugins.mybatis.entity.IPageData;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer/info")
@AllArgsConstructor
public class CustomerInfoController {
    private final CustomerInfoService customerInfoService;

    @GetMapping({"","query"})
    public Result<List<CustomerInfo>> page(CustomerInfoQuery query) {
        IPageData<CustomerInfo> data = customerInfoService.page(query);
        return R.success(data.getTotalRowNum(), data.getData());
    }

    @GetMapping({"list","query/list"})
    public Result<List<CustomerInfo>> list(CustomerInfoQuery query) {
        return R.success(customerInfoService.list(query));
    }

    @GetMapping({"one","query/one"})
    public Result<CustomerInfo> one(CustomerInfoQuery query) {
        return R.success(customerInfoService.one(query));
    }


    @PostMapping
    public Result<?> save(@Validated @RequestBody CustomerInfoFormVo customerInfoFormVo) {
        customerInfoService.save(customerInfoFormVo);
        return R.success();
    }

    @PutMapping("{id}")
    public Result<?> update(@PathVariable Long id, @RequestBody @Validated CustomerInfoFormVo customerInfoFormVo) {
        customerInfoService.update(id, customerInfoFormVo);
        return R.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody @Validated CustomerInfoFormVo customerInfoFormVo) {
        customerInfoService.update(customerInfoFormVo);
        return R.success();
    }

    @GetMapping("{id}")
    public Result<CustomerInfo> get(@PathVariable Long id) {
        return R.success(customerInfoService.get(id));
    }
}