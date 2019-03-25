package com.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SortTest3 {
	
	public static void main(String[] args) {


		List<String> list = new LinkedList<String>();
		list.add("Ravi");
		list.add("Pankaja");
		list.add("Pankaia");
		list.add("Aarya");
		list.add("Malhar");
		list.add("Ambekar");

		list.forEach(System.out::println);
		
		/*
		 * Comparator<String> lengthComparator = new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) { return
		 * Integer.compare(o1.length(), o2.length()); } };
		 * System.out.println("------------"); Collections.sort(list, lengthComparator);
		 * 
		 * list.forEach(System.out::println);
		 */
		
		
		/*
		 * Collections.sort(myList,Comparator.comparing(String::length));
		 * 
		 * System.out.println("------------"); myList.forEach(System.out::println);
		 */
	}
	
	
}