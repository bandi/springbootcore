package com.ir.container;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Aspect
@Configuration
public class UserSecurityAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //What kind of method calls I would intercept
    //execution(* PACKAGE.*.*(..))
    //Weaving & Weaver
    //@Before("execution(public com.ir.service.*.*(..))")
    @Before("within(com.ir.service.*)")
    public void before(JoinPoint joinPoint){
        //Advice
        logger.info(" Check for user access ");
        logger.info(" Allowed execution for {}", joinPoint);
    }
}