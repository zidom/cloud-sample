package com.primeton.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author <a href='mailto:huzd@primeton.com'>虎振东</a>
 * @date 2017/1/9 10:20.
 */
@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService srv;


    @GetMapping("/hello")
    public Object hello(String name) {
        return srv.hello(name);
    }

    @GetMapping("/hello2")
    public Object hello2(String name) {
        return srv.hello2(name);
    }


}
