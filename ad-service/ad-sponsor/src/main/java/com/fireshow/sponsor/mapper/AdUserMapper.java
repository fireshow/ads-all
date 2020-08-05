package com.fireshow.sponsor.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fireshow.sponsor.entity.AdUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Vincent
 * @version 1.0
 * @date 2020/8/2 10:26
 **/

@Mapper
public interface AdUserMapper extends BaseMapper<AdUser> {
    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);


    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(AdUser record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    AdUser selectByPrimaryKey(Long id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(AdUser record);

}
