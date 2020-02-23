package com.ibm.training.Collections;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		
		for(String item : set){
			System.out.println("Item: "+item);
		}

	}

}
