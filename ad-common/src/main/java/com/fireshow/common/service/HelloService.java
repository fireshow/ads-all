package com.fireshow.common.service;

import java.io.Serializable;

/**
 * @author Vincent
 * @version 1.0
 * @date 2020/8/4 21:21
 **/
public interface HelloService extends Serializable {
    String say(String name);
}
