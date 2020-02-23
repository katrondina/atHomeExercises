package com.ibm.training.Collections;

import java.util.Deque;
import java.util.ArrayDeque;

public class TestStack {

	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<String>();
		
		stack.push("one");
		stack.push("two");
		stack.push("three");
		
		int size = stack.size() - 1;
		while(size >= 0){
			System.out.println(stack.pop());
			size--;
		}
	}

}
