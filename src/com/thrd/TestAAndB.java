package com.thrd;

public class TestAAndB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		A a2 =new A();
		a.setName("a");
		a2.setName("second");
		B b=new B();
		a.start();
		a2.start();
		try
		{
			a.join();
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		//b.start();
	}

}
