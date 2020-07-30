package com.fireshow.sponsor.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fireshow.sponsor.mapper.AdUnitItMapper;
import com.fireshow.sponsor.entity.unit_condition.AdUnitIt;
import com.fireshow.sponsor.service.AdUnitItService;
/**
 *
 *@author Vincent(sec1995@hotmail.com)
 *@date 2020/7/27 23:07
 *@version 1.0
 **/

@Service
public class AdUnitItServiceImpl implements AdUnitItService{

    @Resource
    private AdUnitItMapper adUnitItMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return adUnitItMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(AdUnitIt record) {
        return adUnitItMapper.insert(record);
    }

    @Override
    public int insertSelective(AdUnitIt record) {
        return adUnitItMapper.insertSelective(record);
    }

    @Override
    public AdUnitIt selectByPrimaryKey(Integer id) {
        return adUnitItMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AdUnitIt record) {
        return adUnitItMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AdUnitIt record) {
        return adUnitItMapper.updateByPrimaryKey(record);
    }

}
