package com.fireshow.sponsor.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 *
 *@author Vincent
 *@date 2020/8/2 10:26
 *@version 1.0
 **/

/**
 * 用户信息表
 */
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
    private Byte userStatus;

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
