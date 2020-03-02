package com.maps;

import java.util.HashMap;
import java.util.Set;

public class TestGetKeys {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
		hashmap.put(1, "rollno");
		hashmap.put(2, "name");
		hashmap.put(3, "marks");
		//getting value using a key
		String str=hashmap.get(3);
		System.out.println(str);
		//getting all keys
		Set<Integer> set=hashmap.keySet();
		for (Integer integer : set) 
		{
			//Integer integer=(Integer)object;
			System.out.println(integer);
			//getting values using keys
			String string=hashmap.get(integer);
			System.out.println(string);
		}
	}

}
