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
 *@date 2020/7/27 23:11
 *@version 1.0
 **/

/**
    * 创意表
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdCreative implements Serializable {
    /**
    * 自增主键
    */
    private Long id;

    /**
    * 创意名称
    */
    private String name;

    /**
    * 物料类型(图片, 视频)
    */
    private String type;

    /**
    * 物料子类型(图片: bmp, jpg 等等)
    */
    private String materialType;

    /**
    * 高度
    */
    private Integer height;

    /**
    * 宽度
    */
    private Integer width;

    /**
    * 物料大小, 单位是 KB
    */
    private Long size;

    /**
    * 持续时长, 只有视频才不为 0
    */
    private Integer duration;

    /**
    * 审核状态
    */
    private String auditStatus;

    /**
    * 标记当前记录所属用户
    */
    private Long userId;

    /**
    * 物料地址
    */
    private String url;

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
