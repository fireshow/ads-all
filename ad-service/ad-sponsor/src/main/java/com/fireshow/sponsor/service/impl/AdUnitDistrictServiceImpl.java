package com.fireshow.sponsor.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fireshow.sponsor.entity.unit_condition.AdUnitDistrict;
import com.fireshow.sponsor.mapper.AdUnitDistrictMapper;
import com.fireshow.sponsor.service.AdUnitDistrictService;
/**
 *
 *@author Vincent(sec1995@hotmail.com)
 *@date 2020/7/27 23:07
 *@version 1.0
 **/

@Service
public class AdUnitDistrictServiceImpl implements AdUnitDistrictService{

    @Resource
    private AdUnitDistrictMapper adUnitDistrictMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return adUnitDistrictMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(AdUnitDistrict record) {
        return adUnitDistrictMapper.insert(record);
    }

    @Override
    public int insertSelective(AdUnitDistrict record) {
        return adUnitDistrictMapper.insertSelective(record);
    }

    @Override
    public AdUnitDistrict selectByPrimaryKey(Integer id) {
        return adUnitDistrictMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AdUnitDistrict record) {
        return adUnitDistrictMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AdUnitDistrict record) {
        return adUnitDistrictMapper.updateByPrimaryKey(record);
    }

}
