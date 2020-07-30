package com.fireshow.sponsor.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *@author Vincent(sec1995@hotmail.com)
 *@date 2020/7/27 23:09
 *@version 1.0
 **/

/**
 * 推广计划表
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdPlan implements Serializable {
    /**
     * 自增主键
     */
    private Long id;

    /**
     * 标记当前记录所属用户
     */
    private Long userId;

    /**
     * 推广计划名称
     */
    private String planName;

    /**
     * 推广计划状态
     */
    private String planStatus;

    /**
     * 推广计划开始时间；
     */
    private Date startDate;

    /**
     * 推广计划结束时间；
     */
    private Date endDate;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}
