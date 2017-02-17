package com.primeton.sample;

import org.springframework.stereotype.Component;

/**
 * @author <a href='mailto:huzd@primeton.com'>虎振东</a>
 * @date 2017/2/16 10:40.
 */
@Component
public class HelloServiceFallback implements HelloService {
    @Override
    public String hello(String name) {
        return "ERROR";
    }
}
