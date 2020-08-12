package com.fireshow.sponsor.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fireshow.sponsor.entity.AdPlan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Vincent
 * @version 1.0
 * @date 2020/7/27 23:09
 **/

@Mapper
public interface AdPlanMapper  extends BaseMapper<AdPlan> {
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
    int insertSelective(AdPlan record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    AdPlan selectByPrimaryKey(Long id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(AdPlan record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(AdPlan record);

    AdPlan findByIdAndUserId(Long id, Long userId);

    List<AdPlan> findAllByIdInAndUserId(List<Long> ids, Long userId);
}
