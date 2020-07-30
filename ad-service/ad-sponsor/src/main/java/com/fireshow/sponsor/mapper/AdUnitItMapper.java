package com.fireshow.sponsor.mapper;

import com.fireshow.sponsor.entity.unit_condition.AdUnitIt;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 *@author Vincent(sec1995@hotmail.com)
 *@date 2020/7/27 23:07
 *@version 1.0
 **/

@Mapper
public interface AdUnitItMapper {
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
    int insert(AdUnitIt record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(AdUnitIt record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    AdUnitIt selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(AdUnitIt record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(AdUnitIt record);
}
