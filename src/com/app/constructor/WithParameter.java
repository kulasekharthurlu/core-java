package com.app.constructor;

public class WithParameter {
	String name;
	int rollno;
	WithParameter(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
}
	public static void main(String[] args) {
		WithParameter a=new WithParameter("kula",8573);
		System.out.print(a.name+" "+a.rollno);
	}

}
