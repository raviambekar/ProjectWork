package com.test;

public class App {

	public static int amount = 0;
	
	public void deposit (int cash) {
		amount = amount + cash;
		System.out.println("deposit:" + amount );
		//notify();
	}
	
	public void withdrawal(int cash) {

		synchronized (this) {

			if (amount <= 0) {
				try {
					System.out.println("waiting..." );
					wait(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				amount = amount - cash;
				System.out.println("withdrawal:" + amount);
			}
		}
	
	}
	
	public static void main(String[] args) {

		App app = new App();
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				app.withdrawal(1000);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		thread1.start();
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				
				try {
					Thread.sleep(10000);
					app.deposit(2000);	
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		thread2.start();
	}

}
