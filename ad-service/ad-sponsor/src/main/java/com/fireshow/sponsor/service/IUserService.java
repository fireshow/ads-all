package com.fireshow.sponsor.service;


import com.fireshow.common.exceptions.AdException;
import com.fireshow.sponsor.vo.CreateUserRequest;
import com.fireshow.sponsor.vo.CreateUserResponse;

/**
 * Created by Qinyi.
 */
public interface IUserService {

    /**
     * <h2>创建用户</h2>
     * */
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}
