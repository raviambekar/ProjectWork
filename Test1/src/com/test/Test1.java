package com.test;

import java.util.ArrayList;
import java.util.SortedMap;

public class Test1 {

	public void CallMe(int x) {
		x=10;
		System.out.println("In callme " + x);
	}
	
	public void CallString(String x) {
		x="Changed";
		System.out.println("In callme " + x);
	}
	
	public void CallString1(String x) {
		x="Changed1";
		System.out.println("In callme " + x);
	}
	
	public void CallString2(String[] x) {
		x[0]="bb";
		System.out.println("In callme " + x[0]);
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> str1 = new ArrayList<String>();
		
		Test1 test1 = new Test1();
		int y = 4;
		test1.CallMe(y);
		System.out.println("In main " + y);

		String q="original";
		test1.CallString(q);
		System.out.println("In main " + q);
		
		String qq= new String("original1");
		test1.CallString1(qq);
		System.out.println("In main " + qq);
		
		String[] qqq= {"aa"};
		System.out.println("In main " + qqq[0]);
		test1.CallString2(qqq);
		System.out.println("In main " + qqq[0]);
		
			}

}
