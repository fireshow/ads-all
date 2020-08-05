package com.fireshow.sponsor.mapper;

import com.fireshow.sponsor.entity.AdCreative;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 *@author Vincent(sec1995@hotmail.com)
 *@date 2020/7/27 23:11
 *@version 1.0
 **/

@Mapper
public interface AdCreativeMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(AdCreative record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(AdCreative record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    AdCreative selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(AdCreative record);

}
