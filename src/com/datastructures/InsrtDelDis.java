package com.datastructures;

import java.util.Scanner;

public class InsrtDelDis 
{
	Scanner scanner=new Scanner(System.in);
	int top=-1;
	int ar[]=new int[10];
	public void push()
	{
		if(top<9)
		{
			System.out.println("enter value");
			ar[++top]=scanner.nextInt();
		}
		else
		{
			System.out.println("Stack is full cannot insert anymore");
		}
	}
	
	public int pop()
	{
		int x;
		if(top==-1)
		{
			System.out.println("no element to pop");
			return 0;
		}
		else
		{
			x=ar[top--];
		}
		return x;
	}
	
	public void display()
	{
		int y=top;
		while(top>=0)
		{
			System.out.println(ar[top--]);
		}
		top=y;
	}
}

