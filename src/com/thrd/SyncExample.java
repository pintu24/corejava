package com.thrd;

public class SyncExample {

	public static void main(String[] args) {
		TicketBooking t1=new TicketBooking();
		
		Passenger passenger1=new Passenger(t1);
		Passenger passenger2=new Passenger(t1);
		Passenger passenger3=new Passenger(t1);
		passenger1.start();
		passenger2.start();
		passenger3.start();
	}

}
