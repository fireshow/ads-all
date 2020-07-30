package com.fireshow.sponsor.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fireshow.sponsor.entity.AdUnit;
import com.fireshow.sponsor.mapper.AdUnitMapper;
import com.fireshow.sponsor.service.AdUnitService;
/**
 *
 *@author Vincent(sec1995@hotmail.com)
 *@date 2020/7/27 23:09
 *@version 1.0
 **/

@Service
public class AdUnitServiceImpl implements AdUnitService{

    @Resource
    private AdUnitMapper adUnitMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return adUnitMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(AdUnit record) {
        return adUnitMapper.insert(record);
    }

    @Override
    public int insertSelective(AdUnit record) {
        return adUnitMapper.insertSelective(record);
    }

    @Override
    public AdUnit selectByPrimaryKey(Long id) {
        return adUnitMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AdUnit record) {
        return adUnitMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AdUnit record) {
        return adUnitMapper.updateByPrimaryKey(record);
    }

}
