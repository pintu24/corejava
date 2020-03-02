package com.maps;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class TestNoOfOccurences {

	public static void main(String[] args) {
		
		LinkedHashMap map=new LinkedHashMap();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scanner.next();
		char arr[]=str.toCharArray();
		for (char ch : arr) 
		{
			if(map.containsKey(ch))
			{
				map.put(ch, (int)map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
			
		}
		Set set=map.keySet();
		for(Object object:set)
		{
			Character character=(Character)object;
			System.out.println(character+"---"+map.get(character));
		}

	}

}
