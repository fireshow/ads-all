package com.fireshow.sponsor.service;

import com.fireshow.common.exceptions.AdException;
import com.fireshow.sponsor.entity.AdUser;
    /**
 *
 *@author Vincent(wenzheng.shao@hand-china.com)
 *@date 2020/8/2 10:26
 *@version 1.0
 **/

public interface AdUserService{

   AdUser createUser(AdUser user) throws AdException;
}
