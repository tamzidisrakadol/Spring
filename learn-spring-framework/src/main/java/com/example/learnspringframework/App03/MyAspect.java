package com.example.learnspringframework.App03;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Before("execution(* com.example.learnspringframework.App03.PaymentServiceImpl.makePayment(..))")
    public void AuthBeforePayment(){
        System.out.println("Authentication started");
    }

    @After("execution(* com.example.learnspringframework.App03.PaymentServiceImpl.makePayment(..))")
    public void AuthAfterPayment(){
        System.out.println(" payment done");
    }
}
