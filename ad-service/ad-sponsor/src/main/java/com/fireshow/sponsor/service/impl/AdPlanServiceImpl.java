package com.fireshow.sponsor.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fireshow.sponsor.entity.AdPlan;
import com.fireshow.sponsor.mapper.AdPlanMapper;
import com.fireshow.sponsor.service.AdPlanService;
/**
 *
 *@author Vincent(sec1995@hotmail.com)
 *@date 2020/7/27 23:09
 *@version 1.0
 **/

@Service
public class AdPlanServiceImpl implements AdPlanService{

    @Resource
    private AdPlanMapper adPlanMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return adPlanMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(AdPlan record) {
        return adPlanMapper.insert(record);
    }

    @Override
    public int insertSelective(AdPlan record) {
        return adPlanMapper.insertSelective(record);
    }

    @Override
    public AdPlan selectByPrimaryKey(Long id) {
        return adPlanMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AdPlan record) {
        return adPlanMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AdPlan record) {
        return adPlanMapper.updateByPrimaryKey(record);
    }

}
