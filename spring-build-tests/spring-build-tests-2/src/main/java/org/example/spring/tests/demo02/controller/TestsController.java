package org.example.spring.tests.demo02.controller;

import cn.hutool.extra.servlet.ServletUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("tests")
@Slf4j
public class TestsController {
    @RequestMapping
    public Map<String, String> index(HttpServletRequest request) {
        Map<String, String> headerMap = ServletUtil.getHeaderMap(request);
        log.info(request.getContentType());
        return headerMap;
    }
}