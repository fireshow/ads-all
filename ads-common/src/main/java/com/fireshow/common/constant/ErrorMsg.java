package com.fireshow.common.constant;

import java.io.Serializable;

/**
 * @author Vincent
 * @version 1.0
 * @date 2020/8/2 11:14
 **/
public interface ErrorMsg extends Serializable {
    String MULTI_USER_ERROR ="multi.user.error";
    String COMMON_ERROR ="business.common.error";
    String OBJECT_INSERT_ERROR ="object.insert.error";
    String REQUEST_PARAM_ERROR = "请求参数错误";
    String SAME_NAME_ERROR = "存在同名的用户";
    String CAN_NOT_FIND_RECORD = "找不到数据记录";
    String SAME_NAME_PLAN_ERROR = "存在同名的推广计划";
    String SAME_NAME_UNIT_ERROR = "存在同名的推广单元";
}
