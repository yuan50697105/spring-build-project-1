package org.example.applications.controller;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.domains.service.CustomerContractService;
import org.example.domains.service.CustomerInfoService;
import org.example.domains.service.CustomerService;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoVo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer/info")
@AllArgsConstructor
public class CustomerInfoController {
    private final CustomerService customerService;
    private final CustomerContractService customerContractService;
    private final CustomerInfoService customerInfoService;

    @PostMapping
    public Result<?> save(@Validated @RequestBody CustomerInfoVo customerInfoVo) {
        customerInfoService.save(customerInfoVo);
        return R.success();
    }
}