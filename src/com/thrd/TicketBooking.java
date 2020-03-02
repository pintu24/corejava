package com.thrd;

public class TicketBooking
{
	int noOfTickets=10;
	synchronized public void BookTicket()
	{
		noOfTickets--;
		showAvailableTickets();
	}
	public void showAvailableTickets()
	{
		System.out.println("Available tickets = "+noOfTickets);
	}
}
