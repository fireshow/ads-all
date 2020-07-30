package com.fireshow.sponsor.service;

import com.fireshow.sponsor.entity.unit_condition.AdUnitDistrict;
    /**
 *
 *@author Vincent(sec1995@hotmail.com)
 *@date 2020/7/27 23:07
 *@version 1.0
 **/

public interface AdUnitDistrictService{


    int deleteByPrimaryKey(Integer id);

    int insert(AdUnitDistrict record);

    int insertSelective(AdUnitDistrict record);

    AdUnitDistrict selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdUnitDistrict record);

    int updateByPrimaryKey(AdUnitDistrict record);

}
