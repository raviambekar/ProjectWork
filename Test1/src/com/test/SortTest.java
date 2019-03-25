package com.test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


class MyComparable implements Comparable<MyComparable>{

	private String str1;
	
	public MyComparable(String str1) {
		this.str1 = str1;
	}


	@Override
	public int compareTo(MyComparable myComparable) {
		System.out.println();
		
		if (str1.length() == myComparable.str1.length()) {
			return 0;
		}else if (str1.length() < myComparable.str1.length()) {
			return -1;
		}
		return 0;		
	}


	@Override
	public String toString() {
		return str1;
	}
	
	
}

public class SortTest {
	
	public static void main(String[] args) {


		List<MyComparable> myList = new LinkedList<MyComparable>();
		myList.add(new MyComparable("Ravi"));
		myList.add(new MyComparable("Pankaja"));
		myList.add(new MyComparable("Aarya"));
		myList.add(new MyComparable("Malhar"));
		myList.add(new MyComparable("Ambekar"));

		SortTest sortTest = new SortTest();
		sortTest.printList(myList);
		
		Collections.sort(myList);
		
		System.out.println("------------");
		sortTest.printList(myList);
	}

	
	
	private void printList(List<MyComparable> list) {
		
		for (MyComparable myComparable : list) {
			System.out.println(myComparable);
		}
		
	}
	
}
