package com.fireshow.sponsor.service;

import com.fireshow.sponsor.entity.AdCreative;
    /**
 *
 *@author Vincent(sec1995@hotmail.com)
 *@date 2020/7/27 23:11
 *@version 1.0
 **/

public interface AdCreativeService{


    int deleteByPrimaryKey(Long id);

    int insert(AdCreative record);

    int insertSelective(AdCreative record);

    AdCreative selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AdCreative record);

    int updateByPrimaryKey(AdCreative record);

}
