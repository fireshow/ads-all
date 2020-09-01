package com.fireshow.common.constant;

import lombok.Getter;

/**
 * Vincent
 */
@Getter
public enum CreativeMetrialType {

    JPG(1, "jpg"),
    BMP(2, "bmp"),

    MP4(3, "mp4"),
    AVI(4, "avi"),

    TXT(5, "txt");

    private final int type;
    private final String desc;

    CreativeMetrialType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
