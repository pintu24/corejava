package corejava;

import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {
	char ch[]=new char[20];
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the string");
	String string=scanner.next();
	ch=string.toCharArray();
	System.out.println(ch[0]);
	
	int lastIndex=ch.length-1;
	System.out.println(ch[lastIndex]);
	int i=0;
	while(i<=lastIndex)
	{
		if(ch[i]==ch[lastIndex])
		{
			i++;
			lastIndex--;
		}
		else
		{
			System.out.println("It is not a palindrom");
			break;
		}
	}
	if(i>lastIndex)
	{
		System.out.println("It is a palindrom");
	}

	}

}
