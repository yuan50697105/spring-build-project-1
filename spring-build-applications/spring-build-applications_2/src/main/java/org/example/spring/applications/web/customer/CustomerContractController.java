package org.example.spring.applications.web.customer;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.spring.domains.customer.service.CustomerContractService;
import org.example.spring.infrastructures.mysql.customer.entity.query.CustomerContractQuery;
import org.example.spring.infrastructures.mysql.customer.entity.result.CustomerContract;
import org.example.spring.infrastructures.mysql.customer.entity.result.CustomerContractDetails;
import org.example.spring.infrastructures.mysql.customer.entity.vo.CustomerContractFormVo;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("customer/contract")
@AllArgsConstructor
public class CustomerContractController {
    private final CustomerContractService customerContractService;

    @GetMapping
    public Result<List<CustomerContract>> queryPage(CustomerContractQuery query) {
        IPageData<CustomerContract> data = customerContractService.selectPage(query);
        return R.success(data.getTotalRowNum(), data.getData());
    }

    @GetMapping("list/{size}")
    public Result<List<CustomerContract>> queryList(CustomerContractQuery query, @PathVariable(required = false) int size) {
        query.setSize(size);
        List<CustomerContract> list = customerContractService.selectList(query);
        return R.success((long) list.size(), list);
    }

    @GetMapping("one")
    public Result<CustomerContract> queryOne(CustomerContractQuery query) {
        CustomerContract data = customerContractService.selectOne(query);
        return R.success(data);
    }

    @GetMapping("{id}")
    public Result<CustomerContractDetails> get(@PathVariable Long id) {
        return R.success(customerContractService.get(id));
    }

    @PostMapping
    public Result<?> save(@RequestBody CustomerContractFormVo formVo) {
        customerContractService.save(formVo);
        return R.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody CustomerContractFormVo formVo) {
        customerContractService.update(formVo);
        return R.success();
    }

    @PutMapping("{id}")
    public Result<?> update(@PathVariable Long id, @RequestBody CustomerContractFormVo formVo) {
        formVo.setId(id);
        customerContractService.update(formVo);
        return R.success();
    }

    @DeleteMapping("{id}")
    public Result<?> delete(@PathVariable Long id) {
        customerContractService.delete(Collections.singletonList(id));
        return R.success();
    }

    @DeleteMapping
    public Result<?> delete(List<Long> ids) {
        customerContractService.delete(ids);
        return R.success();
    }

    @PostMapping
    public Result<?> upload(Long id, MultipartFile file) {
        customerContractService.upload(id, file);
        return R.success();
    }
}