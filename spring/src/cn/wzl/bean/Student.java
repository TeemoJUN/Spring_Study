package cn.wzl.bean;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

public class Student implements Show{
	private String name;
	private List<String> hobbies;
	private String[] friends;
	private HashMap<String,String> relation;
	private String hair;
	
	private Properties books;
	
	public void setHair(String hair){
		this.hair=hair;
	}
	
	public void setBooks(Properties books){
		this.books=books;
	}
	
	public Student(){
		System.out.println("学生被创建------");
	}
	public void setName(String name){
		this.name=name;
	}
	
	public void setRelation(HashMap<String,String> relation){
		this.relation=relation;
	}
	
	public void setFriends(String[] friends){
		this.friends=friends;
	}
	
	
	public void setHobbies(List<String> hobbies){
		this.hobbies=hobbies;
	}
	
	
	
	
	
	
	@Override
	public void show(){
		System.out.println("student"+name+Arrays.toString(friends)+"  "+hobbies.toString()+"   "+relation.toString()+"   "+hair+"  "+books.toString());
	}
	
	
	
	
	
	
	
	
}
