package com.testing;

import java.util.Scanner;

public class PalindromUsingStringBuffer {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any word");
		String word=scanner.next();
		StringBuffer buffer=new StringBuffer(word);
		buffer.reverse();
		//System.out.println(buffer);
		String reverse=new String(buffer);
		if(word.equalsIgnoreCase(reverse))
		{
			System.out.println(word+" is a palindrom");
		}
		else
		{
			System.out.println(word+" is not a palindrom");
		}

	}

}
