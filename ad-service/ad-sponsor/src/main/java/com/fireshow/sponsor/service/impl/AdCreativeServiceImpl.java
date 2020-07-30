package com.fireshow.sponsor.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fireshow.sponsor.entity.AdCreative;
import com.fireshow.sponsor.mapper.AdCreativeMapper;
import com.fireshow.sponsor.service.AdCreativeService;
/**
 *
 *@author Vincent(sec1995@hotmail.com)
 *@date 2020/7/27 23:11
 *@version 1.0
 **/

@Service
public class AdCreativeServiceImpl implements AdCreativeService{

    @Resource
    private AdCreativeMapper adCreativeMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return adCreativeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(AdCreative record) {
        return adCreativeMapper.insert(record);
    }

    @Override
    public int insertSelective(AdCreative record) {
        return adCreativeMapper.insertSelective(record);
    }

    @Override
    public AdCreative selectByPrimaryKey(Long id) {
        return adCreativeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AdCreative record) {
        return adCreativeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AdCreative record) {
        return adCreativeMapper.updateByPrimaryKey(record);
    }

}
