package com.thrd;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TicketBookingWindow extends JFrame implements ActionListener
{
	TicketBookingWindow()
	{
		setVisible(true);
		JLabel label=new JLabel("Booking");
		JButton button=new JButton("CONFIRM");
		JTextField field=new JTextField(20);
		setLayout(new FlowLayout());
		add(label);
		add(field);
		add(button);
		button.addActionListener(this);
		setSize(300, 400);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("confirmed");
		TicketBooking booking=new TicketBooking();
		Passenger p1=new Passenger(booking);
		p1.start();
		
	}
}
