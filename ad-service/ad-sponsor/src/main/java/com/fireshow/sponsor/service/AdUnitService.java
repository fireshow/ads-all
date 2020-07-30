package com.fireshow.sponsor.service;

import com.fireshow.sponsor.entity.AdUnit;
    /**
 *
 *@author Vincent(sec1995@hotmail.com)
 *@date 2020/7/27 23:09
 *@version 1.0
 **/

public interface AdUnitService{


    int deleteByPrimaryKey(Long id);

    int insert(AdUnit record);

    int insertSelective(AdUnit record);

    AdUnit selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AdUnit record);

    int updateByPrimaryKey(AdUnit record);

}
