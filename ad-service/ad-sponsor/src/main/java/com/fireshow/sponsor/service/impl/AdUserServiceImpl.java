package com.fireshow.sponsor.service.impl;

import com.fireshow.common.constant.ErrorMsg;
import com.fireshow.common.exceptions.AdException;
import com.fireshow.sponsor.entity.AdUser;
import com.fireshow.sponsor.mapper.AdUserMapper;
import com.fireshow.sponsor.service.AdUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 *
 *@author Vincent(wenzheng.shao@hand-china.com)
 *@date 2020/8/2 10:26
 *@version 1.0
 **/

@Service
public class AdUserServiceImpl implements AdUserService{

    @Resource
    private AdUserMapper mapper;

    @Override
    @Transactional(rollbackFor = AdException.class)
    public AdUser createUser(AdUser user) throws AdException {
        if (StringUtils.isNotEmpty(user.getUsername()))
        {
            Map<String,Object > param=new HashMap<>(2);
            param.put("username",user.getUsername());
            if (mapper.selectByMap(param).size()>0)
            {
                throw new AdException(ErrorMsg.MULTI_USER_ERROR);
            }
            if (mapper.insertSelective(user) ==1)
            {
                return mapper.selectByMap(param).get(0);
            }
            else {
                throw new AdException(ErrorMsg.OBJECT_INSERT_ERROR);
            }
        }
        return null;
    }
}
