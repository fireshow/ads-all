package com.fireshow.common.advice;

import com.fireshow.common.constant.ErrorMsg;
import com.fireshow.common.exceptions.AdException;
import com.fireshow.common.vo.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Vincent
 * @version 1.0
 * @date 2020/7/21 11:47
 **/
@RestControllerAdvice
@Slf4j
public class GlobalExceptionAdvice {
    @ExceptionHandler(value = AdException.class)
    public CommonResponse<String> handleAdException(HttpServletRequest request, AdException adException)
    {
        log.error("Exception happened:\n", adException);
        return new CommonResponse<>(-1,
                exceptionMessageIn18(adException.getMessage()));
    }

    /**
     * 国际化实现
     * @param message 错误信息
     * @return 错误信息
     */
    private String exceptionMessageIn18(String message){
        if(StringUtils.isEmpty(message))
        {
            message = ErrorMsg.COMMON_ERROR;
        }
        //获取当前语言环境
        //获取对应内容
        //返回结果
        return message;
    }
}
