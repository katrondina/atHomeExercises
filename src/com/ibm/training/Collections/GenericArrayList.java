package com.ibm.training.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericArrayList {

	public static void main(String[] args) {
		List<Integer> partList = new ArrayList<Integer>(3);
		
		partList.add(new Integer(1111));
		partList.add(new Integer(2222));
		partList.add(new Integer(3333));
//		partList.add("Bad data"); //compiler error now
		
		for(Integer a : partList){
			System.out.println("PartNumber: "+a);
		}
		
		Iterator<Integer> elements = partList.iterator();
		while (elements.hasNext()){
			Integer partNumberObject = elements.next();
			int partNumber = partNumberObject.intValue();
			
			System.out.println("Part number: " + partNumber);
		}
		

	}

}
