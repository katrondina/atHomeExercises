package com.ibm.training.Collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		Map<String, String> partList = new TreeMap<String, String>();
		
		partList.put("s001", "Blue Polo Shirst");
		partList.put("s002","Black polo Shirt");
		partList.put("h001", "Duke Hat");
		partList.put("s002", "Black t-shirt");
		
		Set<String> keys = partList.keySet();
		
		System.out.println("---Part List---");
		for(String key : keys){
			System.out.println("Key: "+key+" "+ partList.get(key));
		}
	}

}
