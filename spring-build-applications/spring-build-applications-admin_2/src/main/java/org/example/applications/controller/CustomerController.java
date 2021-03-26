package org.example.applications.controller;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.domains.entity.CustomerDetailsResult;
import org.example.domains.entity.CustomerFormVo;
import org.example.domains.service.CustomerService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
@AllArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    public Result<?> save(@RequestBody @Validated CustomerFormVo customerFormVo) {
        customerService.save(customerFormVo);
        return R.success();
    }

    @GetMapping("{id}")
    public Result<CustomerDetailsResult> get(@PathVariable Long id) {
        return R.success(customerService.get(id));
    }
}