package com.datastructures;

import java.util.Scanner;

public class TestStack {

	public static void main(String[] args) {
		
		InsrtDelDis insrtDelDis=new InsrtDelDis();
		Scanner scanner=new Scanner(System.in);
		while(true) {
		System.out.println("Enter the option");
		int option=scanner.nextInt();
		if(option==1)
		{
			insrtDelDis.push();
		}
		if(option==2)
		{
			insrtDelDis.display();
		}
		if(option==3)
		{
			System.out.println(insrtDelDis.pop()+" is poped");
		}
		if(option==4)
		{
			break;
		}
		}
		/*
		
		switch (option) {
		default:
			System.out.println("enter correct option");
			break;
		case 1:
			insrtDelDis.push();
			break;
		case 2:
			insrtDelDis.display();
			break;
		case 3:
			System.out.println(insrtDelDis.pop()+" is poped");
			break;
		case 4:
			System.out.println("end of program");
			break;

		}
		}
		*/
		
	

  }
}
