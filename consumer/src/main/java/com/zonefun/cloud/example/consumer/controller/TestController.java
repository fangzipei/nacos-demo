package com.zonefun.cloud.example.consumer.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description 测试配置文件接口
 * @Date 2023/3/29 11:02
 * @Author ZoneFang
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class TestController {
    @Value("${test:hello}")
    private String test;

    @GetMapping("/test")
    public String getTest(){
        return test;
    }
}
