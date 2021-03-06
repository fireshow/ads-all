package com.fireshow.sponsor;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Vincent
 * @version 1.0
 * @date 2020/7/23 22:07
 **/
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@EnableDubbo
@MapperScan("com.fireshow.sponsor.mapper")
public class SponsorApplication {
    public static void main(String[] args) {
        SpringApplication.run(SponsorApplication.class,args);
    }
}
