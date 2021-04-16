package com.sunshine.mallweb.configer;

import com.sunshine.mallweb.common.ResponseMessage;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author hongtao
 * @version 1.0.0
 * @ClassName WebAspectConfig.java
 * @Description TODO 切面
 * @createTime 2021年03月17日 23:34:00
 */
@Aspect
@Component
public class WebAspectConfig {

    //声明一个切点
    @Pointcut("@annotation(com.sunshine.mallweb.common.RespMsg)")
    public void resultPointCut(){}


    //结果格式转换
    @Around("resultPointCut()")
    public Object resultTranform(ProceedingJoinPoint joinPoint) {
        ResponseMessage<Object> result=null;
        try {
            //获取 加@RespMsg 注解的方法返回结果
            Object obj = joinPoint.proceed();
            if(obj!=null)
            {
                result=new ResponseMessage<>(ResponseMessage.SUCCESS_CODE,obj,ResponseMessage.SUCCESS_MSG);
            }else {
                result=new ResponseMessage<>(ResponseMessage.NULL_CODE,null,ResponseMessage.NULL_MSG);
            }
        } catch (Throwable throwable) {
            result=new ResponseMessage<>(ResponseMessage.ERROR_CODE,null,ResponseMessage.ERROR_MSG+throwable.getMessage());
        }

        return result;
    }

}
