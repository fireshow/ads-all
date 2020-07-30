package com.fireshow.common.annotation;

import java.lang.annotation.*;

/**
 * @author Vincent(wenzheng.shao @ hand - china.com)
 * @version 1.0
 * @date 2020/7/21 11:42
 **/
@Target({ElementType.METHOD,ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface IgnoreCommonResponse {
}
