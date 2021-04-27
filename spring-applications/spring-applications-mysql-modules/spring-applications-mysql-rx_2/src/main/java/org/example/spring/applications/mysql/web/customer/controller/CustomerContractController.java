package org.example.spring.applications.mysql.web.customer.controller;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.spring.domains.mysql.customer.service.CustomerContractService;
import org.example.spring.models.mysql.customer.entity.query.CustomerContractQuery;
import org.example.spring.models.mysql.customer.entity.result.CustomerContract;
import org.example.spring.models.mysql.customer.entity.result.CustomerContractDetails;
import org.example.spring.models.mysql.customer.entity.vo.CustomerContractModelVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.WebAsyncTask;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("customer/contract")
@AllArgsConstructor
public class CustomerContractController {
    private final CustomerContractService customerContractService;

    @GetMapping
    public WebAsyncTask<Result<List<CustomerContract>>> queryPage(CustomerContractQuery query) {
        return new WebAsyncTask<>(() -> {
            IPageData<CustomerContract> data = customerContractService.selectPage(query);
            return R.success(data.getTotalRowNum(), data.getData());
        });
    }

    @GetMapping("list")
    public WebAsyncTask<Result<List<CustomerContract>>> queryList(CustomerContractQuery query) {
        return new WebAsyncTask<>(() -> {
            List<CustomerContract> list = customerContractService.selectList(query);
            return R.success((long) list.size(), list);
        });
    }

    @GetMapping("list/{size}")
    public WebAsyncTask<Result<List<CustomerContract>>> queryList(CustomerContractQuery query, @PathVariable int size) {
        return new WebAsyncTask<>(() -> {
            List<CustomerContract> list = customerContractService.selectList((CustomerContractQuery) query.withSize(size));
            return R.success((long) list.size(), list);
        });
    }

    @GetMapping("one")
    public WebAsyncTask<Result<CustomerContract>> queryOne(CustomerContractQuery query) {
        return new WebAsyncTask<>(() -> {
            CustomerContract data = customerContractService.selectOne(query);
            return R.success(data);

        });
    }

    @GetMapping("{id}")
    public WebAsyncTask<Result<CustomerContractDetails>> get(@PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            CustomerContractDetails data = customerContractService.get(id);
            return R.success(data);
        });
    }

    @PostMapping
    public WebAsyncTask<Result<?>> save(@RequestBody CustomerContractModelVo formVo) {
        return new WebAsyncTask<>(() -> {
            customerContractService.save(formVo);
            return R.success();
        });
    }

    @PutMapping
    public WebAsyncTask<Result<?>> update(@RequestBody CustomerContractModelVo formVo) {
        return new WebAsyncTask<>(() -> {
            customerContractService.update(formVo);
            return R.success();
        });
    }

    @PutMapping("{id}")
    public WebAsyncTask<Result<?>> update(@PathVariable Long id, @RequestBody CustomerContractModelVo formVo) {
        return new WebAsyncTask<>(() -> {
            customerContractService.update((CustomerContractModelVo) formVo.withId(id));
            return R.success();
        });
    }

    @DeleteMapping("{id}")
    public WebAsyncTask<Result<?>> delete(@PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            customerContractService.delete(Collections.singletonList(id));
            return R.success();
        });
    }

    @DeleteMapping
    public WebAsyncTask<Result<?>> delete(List<Long> ids) {
        return new WebAsyncTask<>(() -> {
            customerContractService.delete(ids);
            return R.success();
        });
    }

    @PostMapping(value = "upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public WebAsyncTask<Result<?>> upload(Long id, MultipartFile file) {
        return new WebAsyncTask<Result<?>>(() -> {
            customerContractService.upload(id, file);
            return R.success();
        });
    }
}