package com.fireshow.common.advice;

import com.fireshow.common.vo.CommonResponse;
import com.fireshow.common.exceptions.AdsException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Vincent(wenzheng.shao @ hand - china.com)
 * @version 1.0
 * @date 2020/7/21 11:47
 **/
@RestControllerAdvice
@Slf4j
public class GlobleExceptionAdvice {
    public static final String ERROR_MESSAGE="BUSINESS Exception";
    @ExceptionHandler(value = AdsException.class)
    public CommonResponse<String> handleAdException(HttpServletRequest request, AdsException adsException)
    {
        log.error("Exception happened:\n",adsException);
        CommonResponse<String> response = new CommonResponse<>(-1, ERROR_MESSAGE);
        response.setData(adsException.getMessage());
        return response;
    }
}
