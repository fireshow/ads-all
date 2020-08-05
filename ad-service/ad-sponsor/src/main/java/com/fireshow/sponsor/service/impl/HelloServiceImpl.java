package com.fireshow.sponsor.service.impl;

import com.fireshow.common.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author Vincent
 * @version 1.0
 * @date 2020/8/4 21:26
 **/
@Service()
public class HelloServiceImpl implements HelloService {
    @Override
    public String say(String name) {
        return "hello "+ name;
    }
}
