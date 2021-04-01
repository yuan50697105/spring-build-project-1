package org.example;

import cn.hutool.extra.spring.EnableSpringUtil;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableAsync
@EnableScheduling
@EnableCaching
@EnableSpringUtil
@ComponentScan
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class AutoConfiguration {
}