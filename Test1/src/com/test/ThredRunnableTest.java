package com.test;


class CallMe1 implements Runnable{

	int i;
	
	
	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}


	public CallMe1(int i) {
		this.i = i;
	}


	@Override
	public void run() {
		System.out.println("in run:"  + i );
		
	}
	
}

public class ThredRunnableTest {

	public static void main(String[] args) {
		
		Thread theThread1 = new Thread(new CallMe1(1));
		Thread theThread2 = new Thread(new CallMe1(2));
		
		theThread1.start();
		theThread2.start();
		
		
		// Another method to start thread
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("in Runnable");
				
			}
		}).start();
	}
		
}
