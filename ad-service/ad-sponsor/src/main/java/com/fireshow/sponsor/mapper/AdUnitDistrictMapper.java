package com.fireshow.sponsor.mapper;

import com.fireshow.sponsor.entity.unit_condition.AdUnitDistrict;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 *@author Vincent(sec1995@hotmail.com)
 *@date 2020/7/27 23:07
 *@version 1.0
 **/

@Mapper
public interface AdUnitDistrictMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(AdUnitDistrict record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(AdUnitDistrict record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    AdUnitDistrict selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(AdUnitDistrict record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(AdUnitDistrict record);
}
