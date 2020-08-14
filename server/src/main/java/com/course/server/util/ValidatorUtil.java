package com.course.server.util;

import org.springframework.util.StringUtils;
import com.course.server.exception.ValidatorException;


public class ValidatorUtil {

    /**
     * 空校验
     * @param str
     * @param fieldName
     */
    public static void require(String str,String fieldName){
        if(StringUtils.isEmpty(str)){
            throw new ValidatorException(fieldName + "不能为空");
        }
    }


    public static void length(String str,String fieldName,int min,int max){
        int length = 0;
        if(!StringUtils.isEmpty(str)){
            length = str.length();
        }
        if(length < min || length > max){
            throw new ValidatorException(fieldName + "长度" + min + "~" + max + "位");
        }
    }
}
