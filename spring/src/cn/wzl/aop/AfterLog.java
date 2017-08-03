package cn.wzl.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterLog implements AfterReturningAdvice{

	
	/**
	 * Ŀ�귽��ִ�к�֪ͨ
	 * 
	 * returnValue---����ֵ
	 * method �����õķ���
	 * arg2��������
	 * target�����õķ����Ķ���
	 * 
	 * */
	
	
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] arg2, Object target) throws Throwable {
		System.out.println("����ִ�к�   "+target.getClass().getSimpleName()+"  "+method.getName()+"����������");
	}

}
