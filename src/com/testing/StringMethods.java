package com.testing;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a word");
		String word=scanner.next();
		System.out.println(word.charAt(3));
		System.out.println(word.compareToIgnoreCase("HELLO"));
		System.out.println(word.compareTo("HELLO"));
		System.out.println(word.concat("world"));
		System.out.println(word.contains("el"));
		System.out.println(word.contentEquals("el"));
	}

}
