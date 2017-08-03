package cn.wzl.bean;

public class Hello implements Show{
	private Student student;
	public Hello(){
		System.out.println("HELLO");
	}
	public Hello(Student student){
		this.student=student;
	}
	public void setStudent(Student student){
		this.student=student;
	}
	public void show(){
		student.show();
		System.out.println("Hello!");
	}
}
