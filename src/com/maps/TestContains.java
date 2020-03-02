package com.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestContains {

	public static void main(String[] args) {
		LinkedHashMap hashMap=new LinkedHashMap();
		hashMap.put('h', 1);
		hashMap.put('e', 1);
		hashMap.put('l', 1);
		//if there are multiple entries of same key-value map will always consider the last entry
		hashMap.put('e', 6);
		hashMap.put('e', 3);
		System.out.println(hashMap.containsKey('h'));
		Set set=hashMap.entrySet();
		for(Object object:set)
		{
			Map.Entry mapEntry=(Map.Entry)object;
			System.out.println(mapEntry.getKey()+"---"+mapEntry.getValue());
		}

	}

}
