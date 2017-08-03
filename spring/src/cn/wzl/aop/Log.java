package cn.wzl.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class Log implements MethodBeforeAdvice{

	
	/*
	 * 
	 * @param ---method 被调用的方法
	 * @param----arg1 方法参数
	 * @param---target 被代理的对象
	 * **/
	
	@Override
	public void before(Method method, Object[] arg1, Object target) throws Throwable {
	
		System.out.println("方法调用前：    "+target.getClass().getSimpleName()+"  "+method.getName()+"方法被调用");
	}

}
