package com.fireshow.sponsor.service;

import com.fireshow.sponsor.entity.unit_condition.AdUnitIt;
    /**
 *
 *@author Vincent(sec1995@hotmail.com)
 *@date 2020/7/27 23:07
 *@version 1.0
 **/

public interface AdUnitItService{


    int deleteByPrimaryKey(Integer id);

    int insert(AdUnitIt record);

    int insertSelective(AdUnitIt record);

    AdUnitIt selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdUnitIt record);

    int updateByPrimaryKey(AdUnitIt record);

}
