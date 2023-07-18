package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* demo.ShoppingCar.checkout(..))")
    public void beforeLogger(JoinPoint jp){
        String argument =  jp.getArgs()[0].toString();
        System.out.println("before Loggers with argument:"+argument);
    }
    // * Return type
    //  Any package
    //  Any class
    @After("execution(* demo.ShoppingCar.checkout(..))")
    public void afterLogger(){
        System.out.println(" after Loggers");
    };

    @Pointcut("execution(* demo.ShoppingCar.quantity(..)))")
    public void afterReturningPointCut(){

    }

    @AfterReturning(pointcut = "afterReturningPointCut()",returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println(" after returning: "+retVal);
    };
}
