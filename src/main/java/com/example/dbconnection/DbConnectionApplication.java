package com.example.dbconnection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@ServletComponentScan
public class DbConnectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbConnectionApplication.class, args);
    }

}
