package com.primeton.sample;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author <a href='mailto:huzd@primeton.com'>虎振东</a>
 * @date 2017/1/9 11:12.
 */
@FeignClient("service-app")
public interface HelloService {

    @RequestMapping(path = "/hello",method = RequestMethod.GET)
    String hello(@RequestParam("name")String name);

}
