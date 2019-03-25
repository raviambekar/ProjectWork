package com.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SortTest2 {
	
	public static void main(String[] args) {


		List<String> myList = new LinkedList<String>();
		myList.add("Ravi");
		myList.add("Pankaja");
		myList.add("Aarya");
		myList.add("Malhar");
		myList.add("Ambekar");

		myList.forEach(System.out::println);
		Collections.sort(myList,Comparator.comparing(String::length));
					
		System.out.println("------------");
		myList.forEach(System.out::println);
	}
	
	
}