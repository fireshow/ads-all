package com.fireshow.search.controller.v1;

import com.fireshow.common.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vincent
 * @version 1.0
 * @date 2020/8/4 22:32
 **/
@RestController
@RequestMapping("/search/")
public class BaseController {
    @Reference(check = false)
    private HelloService helloService;
    @GetMapping("hello/{name}")
    public String SayHello(@PathVariable(value ="name" ) String name){
        return helloService.say(name);
    }
}
