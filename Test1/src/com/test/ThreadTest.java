package com.test;

class CallMe extends Thread{
	int i;
	
	public CallMe(int i) {
		this.i = i;
		/* System.out.println("Thread:" + i); */
		
	}

	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		System.out.println("In run:" + i + " ID:" + this.getId());
	}

	/*
	 * public void printMe() { System.out.println("Thread:" + this.getI()); }
	 */
	
	
}

public class ThreadTest {

	
	
	public static void main(String[] args) {
		Thread theThread1 = new Thread(new CallMe(1));
		Thread theThread2 = new Thread(new CallMe(2));
		
		theThread1.start();
		theThread2.start();
	}

}
