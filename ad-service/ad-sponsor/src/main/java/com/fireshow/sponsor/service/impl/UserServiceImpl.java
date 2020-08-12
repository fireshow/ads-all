package com.fireshow.sponsor.service.impl;

import com.fireshow.common.exceptions.AdException;
import com.fireshow.sponsor.mapper.AdUserMapper;
import com.fireshow.sponsor.service.IUserService;
import com.fireshow.sponsor.vo.CreateUserRequest;
import com.fireshow.sponsor.vo.CreateUserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Qinyi.
 */
@Slf4j
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private  AdUserMapper userMapper;



    @Override
    @Transactional
    public CreateUserResponse createUser(CreateUserRequest request)
            throws AdException {

        return null;
    }
}
