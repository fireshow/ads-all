package com.fireshow.common.constant;

import lombok.Getter;

/**
 * Vincent
 */
@Getter
public enum CreativeType {

    IMAGE(1, "图片"),
    VIDEO(2, "视频"),
    TEXT(3, "文本");

    private final int type;
    private final String desc;

    CreativeType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
