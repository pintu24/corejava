package com.innerclasses;

public class TestInnerClasses {

	public static void main(String[] args) {
		
		OuterClass outerClass=new OuterClass();
		outerClass.i=23;
		System.out.println(outerClass.i);
		OuterClass.InnerClass innerClass=
				outerClass.new InnerClass();
		innerClass.j=24;
		System.out.println(innerClass.j);
		
	}

}
