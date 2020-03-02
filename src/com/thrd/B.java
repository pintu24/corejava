package com.thrd;

public class B extends Thread
{
	public void run()
	{
		for(int i=0;i<6;i++)
		{
			System.out.println("from B"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
