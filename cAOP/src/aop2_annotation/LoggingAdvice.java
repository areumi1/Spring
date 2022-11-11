package aop2_annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect // 이걸 기술해줘야 AOP 기능을 해주는 클래스가 된다
public class LoggingAdvice {

	
	@Before("execution(public * aop2_annotation.*.*Hello(..))") //껴드는 시점까지 적어줘야한다
	public void before(JoinPoint point)throws Throwable
	{
		String methodName = point.getSignature().getName();
		System.out.println("[******* 사전작업 ] " + methodName);
	}
	
	
	
	@After("execution(public * aop2_annotation.*.*Hello(..))")
	public void after(JoinPoint point)throws Throwable
	{
		String methodName = point.getSignature().getName();
		System.out.println("[******* 사후작업 ] " + methodName);
	}
}
