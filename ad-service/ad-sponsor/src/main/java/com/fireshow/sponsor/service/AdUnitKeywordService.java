package com.fireshow.sponsor.service;

import com.fireshow.sponsor.entity.unit_condition.AdUnitKeyword;
    /**
 *
 *@author Vincent(sec1995@hotmail.com)
 *@date 2020/7/27 23:07
 *@version 1.0
 **/

public interface AdUnitKeywordService{


    int deleteByPrimaryKey(Integer id);

    int insert(AdUnitKeyword record);

    int insertSelective(AdUnitKeyword record);

    AdUnitKeyword selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdUnitKeyword record);

    int updateByPrimaryKey(AdUnitKeyword record);

}
