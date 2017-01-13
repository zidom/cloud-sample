package com.primeton.sample;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author <a href='mailto:huzd@primeton.com'>虎振东</a>
 * @date 2017/1/13 09:36.
 */
@Service
public class ConsumerService {


    @Autowired
    private RestTemplate restTemplate;


    public Object hello(String name) {
        return restTemplate.getForEntity("http://SERVICE-APP/hello?name=" + name, String.class);
    }

    @HystrixCommand
    public Object hello2(String name) {
        return restTemplate.getForEntity("http://service-app/hello?name=" + name, String.class);
    }


}
