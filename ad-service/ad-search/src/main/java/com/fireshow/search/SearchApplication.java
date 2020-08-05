package com.fireshow.search;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Vincent
 * @version 1.0
 * @date 2020/7/26 14:30
 **/
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@EnableDubbo
@MapperScan("com.fireshow.search")
public class SearchApplication {
    public static void main(String[] args) {
        SpringApplication.run(SearchApplication.class,args);
    }
}
