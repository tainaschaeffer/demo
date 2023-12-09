import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.demo.Login.metodoBefore(..))")
    public void logBefore() {
        System.out.println("Antes da chamada do método metodoBefore");
    }

    @After("execution(* com.demo.Login.metodoAfter(..))")
    public void logAfter() {
        System.out.println("Depois da chamada do método metodoAfter");
    }

    @Around("execution(* com.demo.Login.metodoAround(..))")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Antes da chamada do método metodoAround");
        joinPoint.proceed();
        System.out.println("Depois da chamada do método metodoAround");
    }
}
