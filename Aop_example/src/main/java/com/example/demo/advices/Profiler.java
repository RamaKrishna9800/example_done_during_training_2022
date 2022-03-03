package com.example.demo.advices;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@EnableAspectJAutoProxy
@Aspect
@Component

public class Profiler {
//	@Around("execution(* com.example.demo.service.CurrencyConverterService.*(..))")
//	
//	public Object estimateTime(ProceedingJoinPoint pjp) throws Throwable{
//		
//		System.out.println("before calling method"+pjp.getSignature().getName() + "called");
//		
//		Object args[]=pjp.getArgs();
//		
//		System.out.println("argument to the method:="+args[0]);
//		
//		Object obj=pjp.proceed();
//		
//		System.out.println("method completed result:="+obj);
//		
//		return obj;
//	}
		      @Around("execution(* com.example.demo.service.CurrencyConverterService.*(..))")
			
			public Object estimateTime(ProceedingJoinPoint pjp) throws Throwable{
			StopWatch watch = new StopWatch();
			watch.start();
			Object obj = pjp.proceed();
			watch.stop();
			System.out.println("time taken to complete in milli seconds:="+watch.getTotalTimeMillis());
			return obj;


}
}
