package org.example.spring.applications.web.customer;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.spring.domains.customer.service.CustomerInfoService;
import org.example.spring.models.customer.entity.query.CustomerQuery;
import org.example.spring.models.customer.entity.result.Customer;
import org.example.spring.models.customer.entity.result.CustomerDetails;
import org.example.spring.models.customer.entity.vo.CustomerFormVo;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("customer/info")
@AllArgsConstructor
public class CustomerInfoController {
    private final CustomerInfoService customerInfoService;

    @GetMapping
    public Result<List<Customer>> selectPage(CustomerQuery query) {
        IPageData<Customer> data = customerInfoService.selectPage(query);
        return R.success(data.getTotalRowNum(), data.getData());
    }

    @GetMapping("list")
    public Result<List<Customer>> selectList(CustomerQuery query) {
        List<Customer> data = customerInfoService.selectList(query);
        return R.success((long) data.size(), data);
    }

    @GetMapping("list/{size}")
    public Result<List<Customer>> selectList(CustomerQuery query,@PathVariable int size) {
        query.setSize(size);
        List<Customer> list = customerInfoService.selectTop(query);
        return R.success((long) list.size(), list);
    }

    @GetMapping("first")
    public Result<Customer> selectFirst(CustomerQuery query) {
        Customer data = customerInfoService.selectFirst(query);
        return R.success(data);
    }

    @GetMapping("one")
    public Result<Customer> selectOne(CustomerQuery query) {
        Customer customer = customerInfoService.selectOne(query);
        return R.success(customer);
    }

    @GetMapping("{id}")
    public Result<CustomerDetails> get(@PathVariable Long id) {
        CustomerDetails data = customerInfoService.get(id);
        return R.success(data);
    }

    @PostMapping
    public Result<?> save(@RequestBody CustomerFormVo formVo) {
        customerInfoService.save(formVo);
        return R.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody CustomerFormVo formVo) {
        customerInfoService.update(formVo);
        return R.success();
    }

    @PutMapping("{id}")
    public Result<?> update(@RequestBody CustomerFormVo formVo, @PathVariable Long id) {
        formVo.setId(id);
        customerInfoService.update(formVo);
        return R.success();
    }

    @DeleteMapping
    public Result<?> delete(List<Long> ids) {
        customerInfoService.delete(ids);
        return R.success();
    }

    @DeleteMapping("{id}")
    public Result<?> delete(@PathVariable Long id) {
        customerInfoService.delete(Collections.singletonList(id));
        return R.success();
    }
}