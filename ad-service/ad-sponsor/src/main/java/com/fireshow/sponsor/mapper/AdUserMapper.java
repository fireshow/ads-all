package com.fireshow.sponsor.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fireshow.sponsor.entity.AdUser;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 *@author Vincent(sec1995@hotmail.com)
 *@date 2020/7/26 14:48
 *@version 1.0
 **/
@Mapper
public interface AdUserMapper extends BaseMapper<AdUser> {
    int deleteByPrimaryKey(Long id);

    int insertSelective(AdUser record);

    AdUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AdUser record);

    int updateByPrimaryKey(AdUser record);
}
