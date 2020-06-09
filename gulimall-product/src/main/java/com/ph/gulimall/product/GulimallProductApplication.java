package com.ph.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* use mybatis plus
* 1. add dependency in common module
* 2. config
*    config datasource info in application.yml
*    mybatis plus config
*       mapperscan
*       sql mapper xml
*
*
* */
@MapperScan("com.ph.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
