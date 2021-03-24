package org.example.applications.controller;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import org.example.domains.service.CustomerInfoService;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer/info")
public class CustomerInfoController {
    @Autowired
    private CustomerInfoService customerInfoService;

    @PostMapping
    public Result<?> save(@Validated @RequestBody CustomerInfoVo customerInfoVo) {
        customerInfoService.save(customerInfoVo);
        return R.success();
    }
}