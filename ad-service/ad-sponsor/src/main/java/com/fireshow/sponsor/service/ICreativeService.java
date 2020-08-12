package com.fireshow.sponsor.service;


import com.fireshow.sponsor.vo.CreativeRequest;
import com.fireshow.sponsor.vo.CreativeResponse;

/**
 * Created by Qinyi.
 */
public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
