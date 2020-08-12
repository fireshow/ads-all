package com.fireshow.sponsor.service.impl;

import com.fireshow.common.exceptions.AdException;
import com.fireshow.sponsor.service.IAdUnitService;
import com.fireshow.sponsor.vo.*;
import org.springframework.stereotype.Service;

/**
 * @author Vincent(sec1995 @ hotmail.com)
 * @version 1.0
 * @date 2020/8/8 10:24
 **/
@Service
public class AdUnitServiceImpl implements IAdUnitService {
    @Override
    public AdUnitResponse createUnit(AdUnitRequest request) throws AdException {
        return null;
    }

    @Override
    public AdUnitKeywordResponse createUnitKeyword(AdUnitKeywordRequest request) throws AdException {
        return null;
    }

    @Override
    public AdUnitItResponse createUnitIt(AdUnitItRequest request) throws AdException {
        return null;
    }

    @Override
    public AdUnitDistrictResponse createUnitDistrict(AdUnitDistrictRequest request) throws AdException {
        return null;
    }

    @Override
    public CreativeUnitResponse createCreativeUnit(CreativeUnitRequest request) throws AdException {
        return null;
    }
}
