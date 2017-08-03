package cn.wzl.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterLog implements AfterReturningAdvice{

	
	/**
	 * 目标方法执行后通知
	 * 
	 * returnValue---返回值
	 * method 被调用的方法
	 * arg2方法参数
	 * target被调用的方法的对象
	 * 
	 * */
	
	
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] arg2, Object target) throws Throwable {
		System.out.println("方法执行后：   "+target.getClass().getSimpleName()+"  "+method.getName()+"方法被调用");
	}

}
