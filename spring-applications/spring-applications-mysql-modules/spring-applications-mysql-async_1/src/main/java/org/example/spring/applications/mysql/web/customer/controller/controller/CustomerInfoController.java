package org.example.spring.applications.mysql.web.customer.controller.controller;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.spring.domains.mysql.customer.service.CustomerInfoService;
import org.example.spring.models.mysql.customer.entity.query.CustomerQuery;
import org.example.spring.models.mysql.customer.entity.result.Customer;
import org.example.spring.models.mysql.customer.entity.result.CustomerDetails;
import org.example.spring.models.mysql.customer.entity.vo.CustomerModelVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.WebAsyncTask;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("customer/info")
@AllArgsConstructor
public class CustomerInfoController {
    private final CustomerInfoService customerInfoService;

    @GetMapping
    public WebAsyncTask<Result<List<Customer>>> selectPage(CustomerQuery query) {
        return new WebAsyncTask<>(() -> {
            IPageData<Customer> data = customerInfoService.selectPage(query);
            return R.success(data.getTotalRowNum(), data.getData());
        });
    }

    @GetMapping("list")
    public WebAsyncTask<Result<List<Customer>>> selectList(CustomerQuery query) {
        return new WebAsyncTask<>(() -> {
            List<Customer> data = customerInfoService.selectTop(query);
            return R.success((long) data.size(), data);
        });
    }

    @GetMapping("list/{size}")
    public WebAsyncTask<Result<List<Customer>>> selectList(CustomerQuery query, @PathVariable int size) {
        return new WebAsyncTask<>(() -> {
            List<Customer> list = customerInfoService.selectTop((CustomerQuery) query.withSize(size));
            return R.success((long) list.size(), list);
        });
    }

    @GetMapping("one")
    public WebAsyncTask<Result<Customer>> selectOne(CustomerQuery query) {
        return new WebAsyncTask<>(() -> {
            Customer customer = customerInfoService.selectFirst(query);
            return R.success(customer);
        });
    }

    @GetMapping("{id}")
    public WebAsyncTask<Result<CustomerDetails>> get(@PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            CustomerDetails data = customerInfoService.get(id);
            return R.success(data);
        });
    }

    @PostMapping
    public WebAsyncTask<Result<?>> save(@RequestBody CustomerModelVo formVo) {
        return new WebAsyncTask<>(() -> {
            customerInfoService.save(formVo);
            return R.success();
        });
    }

    @PutMapping
    public WebAsyncTask<Result<?>> update(@RequestBody CustomerModelVo formVo) {
        return new WebAsyncTask<>(() -> {
            customerInfoService.update(formVo);
            return R.success();
        });
    }

    @PutMapping("{id}")
    public WebAsyncTask<Result<?>> update(@RequestBody CustomerModelVo formVo, @PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            customerInfoService.update((CustomerModelVo) formVo.withId(id));
            return R.success();
        });
    }

    @DeleteMapping
    public WebAsyncTask<Result<?>> delete(List<Long> ids) {
        return new WebAsyncTask<>(() -> {
            customerInfoService.delete(ids);
            return R.success();
        });
    }

    @DeleteMapping("{id}")
    public WebAsyncTask<Result<?>> delete(@PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            customerInfoService.delete(Collections.singletonList(id));
            return R.success();
        });
    }
}