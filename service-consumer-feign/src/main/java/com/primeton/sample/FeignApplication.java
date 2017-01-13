package com.primeton.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author <a href='mailto:huzd@primeton.com'>虎振东</a>
 * @date 2017/1/9 11:10.
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class FeignApplication {


    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }

}
