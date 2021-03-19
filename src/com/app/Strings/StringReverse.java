package com.app.Strings;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sa=new Scanner(System.in);
		String rs="";
		System.out.println("enter name");
		String name=sa.nextLine();
		char[] ch=name.toCharArray();
		for(int i=name.length()-1;i>=0;i--) {
			//System.out.print(name.charAt(i));
			rs=rs+ch[i];
		}
		System.out.println(rs);
	}                  
}
