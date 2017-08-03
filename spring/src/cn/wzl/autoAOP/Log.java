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
		System.out.println("----------����ִ��ǰ-----------");
	}
	@After("execution(* cn.wzl.aop.Hey.*())")
	public void after(){
		System.out.println("----------����ִ�к�-----------");
	}
	@Around("execution(* cn.wzl.aop.Hey.*())")
	public void around(ProceedingJoinPoint jp) throws Throwable{
		System.out.println("����֪ͨǰ------");
		jp.proceed();
		System.out.println("����֪ͨ��------");
	}
	
}
