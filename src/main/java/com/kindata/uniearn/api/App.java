package com.kindata.uniearn.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author wenzhiwei
 * @time 2022-08-15 15:08
 **/
@EnableTransactionManagement
@SpringBootApplication
@EnableScheduling
@MapperScan(basePackages = {"com.kindata.uniearn.api"})
public class App {

    public static void main(String[] args) {

        SpringApplication.run(App.class, args);
    }

}
