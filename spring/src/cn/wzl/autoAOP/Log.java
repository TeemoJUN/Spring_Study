package cn.wzl.autoAOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Log {
	@Before("execution(* cn.wzl.aop.Hey.*())")
	public void before(){
		System.out.println("----------方法执行前-----------");
	}
	@After("execution(* cn.wzl.aop.Hey.*())")
	public void after(){
		System.out.println("----------方法执行后-----------");
	}
	@Around("execution(* cn.wzl.aop.Hey.*())")
	public void around(ProceedingJoinPoint jp) throws Throwable{
		System.out.println("环绕通知前------");
		jp.proceed();
		System.out.println("环绕通知后------");
	}
	
}
