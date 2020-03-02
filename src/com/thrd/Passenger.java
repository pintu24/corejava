package com.thrd;

public class Passenger extends Thread{

	TicketBooking t1;
	public Passenger(TicketBooking t1) 
	{
		this.t1=t1;
	}
	public void run()
	{
		//System.out.println("run is executing");
		t1.BookTicket();
	}

}
