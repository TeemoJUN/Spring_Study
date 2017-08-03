package cn.wzl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.wzl.aop.Hey;
import cn.wzl.bean.Show;

public class AopTest {
	
	public static void main(String[] args){
		System.out.println("aaaaa");
		ApplicationContext a=new ClassPathXmlApplicationContext("beans2.xml");
				
		Show hey=(Show)a.getBean("hey");
		hey.show();
		
		System.out.println("-------------------------------------------");
		
		Hey hey1=(Hey)a.getBean("hey");
		hey1.show();
		
	}
}