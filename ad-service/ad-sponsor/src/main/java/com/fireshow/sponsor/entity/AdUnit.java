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
 * 推广单元表
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdUnit implements Serializable {
    /**
     * 自增主键
     */
    private Long id;

    /**
     * 关联推广计划 id
     */
    private Long planId;

    /**
     * 推广单元名称
     */
    private String unitName;

    /**
     * 推广单元状态
     */
    private String unitStatus;

    /**
     * 广告位类型(开屏, 贴片, 中贴, 暂停帖, 后贴)
     */
    private String positionType;

    /**
     * 预算
     */
    private Long budget;

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
