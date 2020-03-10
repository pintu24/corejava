package com.innerclasses;

public class TestStaticInnerClass {

	public static void main(String[] args) {
		
		StaticInnerClass.InnerClass innerClass=
				new StaticInnerClass.InnerClass();
		innerClass.j=24;
		System.out.println(innerClass.j);
	}

}
