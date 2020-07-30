package com.fireshow.sponsor.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fireshow.sponsor.mapper.AdUnitKeywordMapper;
import com.fireshow.sponsor.entity.unit_condition.AdUnitKeyword;
import com.fireshow.sponsor.service.AdUnitKeywordService;
/**
 *
 *@author Vincent(sec1995@hotmail.com)
 *@date 2020/7/27 23:07
 *@version 1.0
 **/

@Service
public class AdUnitKeywordServiceImpl implements AdUnitKeywordService{

    @Resource
    private AdUnitKeywordMapper adUnitKeywordMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return adUnitKeywordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(AdUnitKeyword record) {
        return adUnitKeywordMapper.insert(record);
    }

    @Override
    public int insertSelective(AdUnitKeyword record) {
        return adUnitKeywordMapper.insertSelective(record);
    }

    @Override
    public AdUnitKeyword selectByPrimaryKey(Integer id) {
        return adUnitKeywordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AdUnitKeyword record) {
        return adUnitKeywordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AdUnitKeyword record) {
        return adUnitKeywordMapper.updateByPrimaryKey(record);
    }

}
