package org.example.applications.controller;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.domains.service.CustomerContractService;
import org.example.modules.repository.mysql.entity.query.CustomerContractQuery;
import org.example.modules.repository.mysql.entity.result.CustomerContract;
import org.example.modules.repository.mysql.entity.vo.CustomerContractFormVo;
import org.example.plugins.mybatis.entity.IPageData;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("customer/contract")
@AllArgsConstructor
public class CustomerContractController {
    private final CustomerContractService customerContractService;

    @PostMapping
    public Result<?> save(@RequestBody @Validated CustomerContractFormVo customerContractResult) {
        customerContractService.save(customerContractResult);
        return R.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody @Validated CustomerContractFormVo customerContractFormVo) {
        customerContractService.update(customerContractFormVo);
        return R.success();
    }

    @GetMapping("{id}")
    public Result<CustomerContract> get(@PathVariable Long id) {
        CustomerContract data = customerContractService.get(id);
        return R.success(data);
    }

    @DeleteMapping
    public Result<?> delete(List<Long> ids) {
        customerContractService.delete(ids);
        return R.success();
    }

    @DeleteMapping("{id}")
    public Result<?> delete(@PathVariable Long id) {
        customerContractService.delete(Collections.singletonList(id));
        return R.success();
    }

    @GetMapping({"one","query/one"})
    public Result<CustomerContract> one(CustomerContractQuery query) {
        CustomerContract data = customerContractService.one(query);
        return R.success(data);
    }

    @GetMapping({"list","query/list"})
    public Result<List<CustomerContract>> list(CustomerContractQuery query) {
        List<CustomerContract> list = customerContractService.list(query);
        return R.success(list);
    }

    @GetMapping({"","query"})
    public Result<List<CustomerContract>> page(CustomerContractQuery query) {
        IPageData<CustomerContract> data = customerContractService.page(query);
        return R.success(data.getTotalRowNum(), data.getData());
    }
}