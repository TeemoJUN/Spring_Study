package cn.wzl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.wzl.bean.Factory;
import cn.wzl.bean.Hello;
import cn.wzl.bean.Person;
import cn.wzl.bean.Show;
import cn.wzl.bean.Student;

public class Test {
	public static void main(String[] args){
		ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		//Show h=(Show)a.getBean("hello");
		//h.show();
		
		System.out.println("------------------");
		
		Student f=(Student)a.getBean("xuyaping");
		f.show();
		
		
		Person p=(Person)a.getBean("person");
		System.out.println(p);
	}
}