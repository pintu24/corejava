package com.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
		hashmap.put(1, "rollno");
		hashmap.put(2, "name");
		hashmap.put(3, "marks");
		//converting map into set form
		Set set=hashmap.entrySet();
		//displaying 
		for(Object object:set)
		{
			Map.Entry<Integer,String> mapentry=(Map.Entry<Integer,String>)object;
			System.out.println(mapentry.getKey());
			System.out.println(mapentry.getValue());
		}

	}

}
