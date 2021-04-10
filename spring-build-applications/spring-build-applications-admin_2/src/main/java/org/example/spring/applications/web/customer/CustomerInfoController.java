package org.example.spring.applications.web.customer;

import lombok.AllArgsConstructor;
import org.example.spring.domains.customer.service.CustomerInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer/info")
@AllArgsConstructor
public class CustomerInfoController {
    private final CustomerInfoService customerInfoService;
}