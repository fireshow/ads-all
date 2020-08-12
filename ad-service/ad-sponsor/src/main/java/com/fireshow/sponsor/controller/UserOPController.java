package com.fireshow.sponsor.controller;

import com.alibaba.fastjson.JSON;
import com.fireshow.common.exceptions.AdException;
import com.fireshow.sponsor.service.IUserService;
import com.fireshow.sponsor.vo.CreateUserRequest;
import com.fireshow.sponsor.vo.CreateUserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Vincent
 */
@Slf4j
@RestController
public class UserOPController {
    @Autowired
    private  IUserService userService;



    @PostMapping("/create/user")
    public CreateUserResponse createUser(
            @RequestBody CreateUserRequest request) throws AdException {
        log.info("ad-sponsor: createUser -> {}",
                JSON.toJSONString(request));
        return userService.createUser(request);
    }
}
