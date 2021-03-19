
package com.app.constructor;

public class SuperThisKeys {
	public SuperThisKeys(double d) {
		this(12);
		System.out.println("double -orgument");
	}
	SuperThisKeys(int i)
	{
		this();
		System.out.println("int -orgument");
		
	}
	SuperThisKeys()
	{
		System.out.println("0 -orgument");
		
	}
	public static void main(String[] args) {
		SuperThisKeys a=new SuperThisKeys(56.09);
		
	}

}
