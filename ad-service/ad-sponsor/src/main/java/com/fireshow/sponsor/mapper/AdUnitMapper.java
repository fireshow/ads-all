package com.fireshow.sponsor.mapper;

import com.fireshow.sponsor.entity.AdUnit;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Vincent
 * @version 1.0
 * @date 2020/7/27 23:09
 **/

@Mapper
public interface AdUnitMapper {
    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(AdUnit record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(AdUnit record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    AdUnit selectByPrimaryKey(Long id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(AdUnit record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(AdUnit record);
}
