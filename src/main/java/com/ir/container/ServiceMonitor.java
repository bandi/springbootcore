package com.ir.container;

import org.aspectj.lang.JoinPoint;

import org.aspectj.lang.annotation.AfterReturning;

import org.aspectj.lang.annotation.Aspect;



import org.springframework.stereotype.Component;



@Aspect


@Component

public class ServiceMonitor {



    @AfterReturning("execution(* com..*Component.*(..))")

    public void logServiceAccess(JoinPoint joinPoint) {

        System.out.println("Completed: " + joinPoint);

    }



}