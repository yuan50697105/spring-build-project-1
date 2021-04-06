package org.example.applications.controller;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import org.example.domains.service.OrderService;
import org.example.modules.repository.mysql.entity.vo.OrderFormVo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order/info")
public class OrderInfoController {
    private final OrderService orderService;

    public OrderInfoController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("{op}")
    public Result<?> add(@PathVariable("op") OrderFormVo.Operating operating, OrderFormVo orderFormVo) {
        orderFormVo.setOperating(operating);
        orderService.addOrder(orderFormVo);
        return R.success();
    }
}