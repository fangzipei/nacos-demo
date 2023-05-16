package com.zonefun.cloud.example.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.function.Consumer;

/**
 * @ClassName ConsumerApplication
 * @Description 启动类
 * @Date 2023/3/29 10:23
 * @Author ZoneFang
 */
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
