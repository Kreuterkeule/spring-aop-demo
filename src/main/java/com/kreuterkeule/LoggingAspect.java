package com.kreuterkeule;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.kreuterkeule.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp) {
        //System.out.println(jp.getSignature());
        Object[] args;
        args = jp.getArgs();
        String firstArg = args[0].toString();
        System.out.println("before Logger with argument: " + firstArg);
    }

    @After("execution(* com.kreuterkeule.ShoppingCart.checkout(..))")
    public void afterLogger() {
        System.out.println("after Logger");
    }

    @Pointcut("execution(* com.kreuterkeule.ShoppingCart.getQuantity(..))")
    public void afterReturningPointCut() {

    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal) {
        System.out.println("After Returning : " + retVal);
    }
}
