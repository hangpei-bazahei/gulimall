package com.ph.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
 *  1. how to remote call other nacos service
 *       openfeign
 *       add Feign interface for remote service
 *              add function for each remote request
 *       Enable Feign Client with package
 * */
/*
*   2. nacos config
*       dependency
*
* */
@EnableFeignClients(basePackages = "com.ph.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
