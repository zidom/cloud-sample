package com.primeton.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href='mailto:huzd@primeton.com'>虎振东</a>
 * @date 2017/1/9 11:14.
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService service;

    @GetMapping("/hello")
    public Object hello(String name) {
        return service.hello(name);
    }


}
