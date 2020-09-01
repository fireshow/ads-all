package com.fireshow.common.constant;

import lombok.Getter;

/**
 * Vincent
 */
@Getter
public enum CommonStatus {

    VALID(1, "有效状态"),
    INVALID(0, "无效状态");

    private final Integer status;
    private final String desc;

    CommonStatus(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }
}
