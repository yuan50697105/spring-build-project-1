package org.example.applications.controller;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.domains.service.CustomerContractService;
import org.example.modules.repository.mysql.entity.vo.CustomerContractVo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer/contract")
@AllArgsConstructor
public class CustomerContractController {
    private final CustomerContractService customerContractService;

    @PostMapping
    public Result<?> save(@RequestBody @Validated CustomerContractVo customerContractVo) {
        customerContractService.save(customerContractVo);
        return R.success();
    }
}