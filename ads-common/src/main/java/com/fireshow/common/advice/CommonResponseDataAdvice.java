package com.fireshow.common.advice;

import com.fireshow.common.annotation.IgnoreCommonResponse;
import com.fireshow.common.vo.CommonResponse;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.Objects;

/**
 * @author Vincent
 * @version 1.0
 * @date 2020/7/21 11:24
 **/
@RestControllerAdvice
public class CommonResponseDataAdvice implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        if (methodParameter.getDeclaringClass().isAnnotationPresent(IgnoreCommonResponse.class))
        {
            return false;
        }
        else return !Objects.requireNonNull(methodParameter.getMethod()).isAnnotationPresent(IgnoreCommonResponse.class);
    }

    @Override
    @SuppressWarnings("all")
    public Object beforeBodyWrite(Object o,
                                  MethodParameter methodParameter,
                                  MediaType mediaType,
                                  Class<? extends HttpMessageConverter<?>> aClass,
                                  ServerHttpRequest serverHttpRequest,
                                  ServerHttpResponse serverHttpResponse) {
        CommonResponse<Object> response =new CommonResponse<>(0,"");
        if (Objects.isNull(o))
        {
            return response;
        }
        else if (o instanceof  CommonResponse)
        {
            response=(CommonResponse<Object>)o;
        }
        else {
            response.setData(o);
        }
        return response;
    }
}
