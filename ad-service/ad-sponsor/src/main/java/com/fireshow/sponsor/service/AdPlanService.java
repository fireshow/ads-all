package com.fireshow.sponsor.service;

import com.fireshow.sponsor.entity.AdPlan;
    /**
 *
 *@author Vincent(sec1995@hotmail.com)
 *@date 2020/7/27 23:09
 *@version 1.0
 **/

public interface AdPlanService{


    int deleteByPrimaryKey(Long id);

    int insert(AdPlan record);

    int insertSelective(AdPlan record);

    AdPlan selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AdPlan record);

    int updateByPrimaryKey(AdPlan record);

}
