package com.fireshow.sponsor.service.impl;

import com.fireshow.common.exceptions.AdException;
import com.fireshow.sponsor.entity.AdPlan;
import com.fireshow.sponsor.service.IAdPlanService;
import com.fireshow.sponsor.vo.AdPlanGetRequest;
import com.fireshow.sponsor.vo.AdPlanRequest;
import com.fireshow.sponsor.vo.AdPlanResponse;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Vincent(sec1995 @ hotmail.com)
 * @version 1.0
 * @date 2020/8/8 10:23
 **/
@Service
public class AdPlanServiceImpl implements IAdPlanService {
    /**
     * <h2>创建推广计划</h2>
     *
     * @param request
     */
    @Override
    public AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException {
        return null;
    }

    /**
     * <h2>获取推广计划</h2>
     *
     * @param request
     */
    @Override
    public List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException {
        return null;
    }

    /**
     * <h2>更新推广计划</h2>
     *
     * @param request
     */
    @Override
    public AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException {
        return null;
    }

    /**
     * <h2>删除推广计划</h2>
     *
     * @param request
     */
    @Override
    public void deleteAdPlan(AdPlanRequest request) throws AdException {

    }
}
