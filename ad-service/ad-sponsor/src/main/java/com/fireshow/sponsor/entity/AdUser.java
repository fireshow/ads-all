package com.fireshow.sponsor.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

/**
 *用户信息表
 *@author Vincent(sec1995@hotmail.com)
 *@date 2020/7/26 14:48
 *@version 1.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("ad_user")
public class AdUser implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 自增主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    @TableField
    private String username;

    /**
     * 给用户生成的 token
     */
    @TableField
    private String token;

    /**
     * 用户状态
     */
    @TableField
    private String userStatus;

    /**
     * 创建时间
     */
    @TableField
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(update = "now()")
    private Date updateTime;
}
