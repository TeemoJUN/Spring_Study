package cn.wzl.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class Log implements MethodBeforeAdvice{

	
	/*
	 * 
	 * @param ---method �����õķ���
	 * @param----arg1 ��������
	 * @param---target ������Ķ���
	 * **/
	
	@Override
	public void before(Method method, Object[] arg1, Object target) throws Throwable {
	
		System.out.println("��������ǰ��    "+target.getClass().getSimpleName()+"  "+method.getName()+"����������");
	}

}
