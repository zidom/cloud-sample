package com.primeton.sample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/hello")
    public Object hello(String name) {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();

        log.info("[{}][{}][{}]", instance.getServiceId(), instance.getHost(), instance.getUri());
        log.info("Services:{} ", discoveryClient.getServices());
        discoveryClient.getInstances(instance.getServiceId()).forEach(inst -> {
            log.info("--> [{}][{}][{}]", inst.getServiceId(), inst.getHost(), inst.getUri());
        });

        return String.format("你好，%s！", name);
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * 传统的war包部署方式
     *
     * @param builder
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
}