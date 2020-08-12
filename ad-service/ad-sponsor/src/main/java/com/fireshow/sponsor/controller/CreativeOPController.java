package com.fireshow.sponsor.controller;

import com.alibaba.fastjson.JSON;
import com.fireshow.sponsor.service.ICreativeService;
import com.fireshow.sponsor.vo.CreativeRequest;
import com.fireshow.sponsor.vo.CreativeResponse;
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
public class CreativeOPController {
    @Autowired
    private  ICreativeService creativeService;

    @PostMapping("/create/creative")
    public CreativeResponse createCreative(
            @RequestBody CreativeRequest request
            ) {
        log.info("ad-sponsor: createCreative -> {}",
                JSON.toJSONString(request));
        return creativeService.createCreative(request);
    }
}
