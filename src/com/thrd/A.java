package com.thrd;

public class A extends Thread
{
	public void run()
	{
		for(int i=0;i<6;i++)
		{
			Thread t=currentThread();
			System.out.println("from A"+"--"+t.getName()+"-"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//System.out.println(" ");
	}
}
