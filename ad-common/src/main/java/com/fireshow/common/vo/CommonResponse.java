package com.fireshow.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * @author Vincent
 * @version 1.0
 * @date 2020/7/21 11:21
 **/
@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResponse<T> implements Serializable {
    private Integer code;
    private String message;
    private T data;
    public CommonResponse(Integer code,String message){
        this.code=code;
        this.message=message;
    }
}
