package com.simplilearn.multithreading;

public class ThreadWithLamda1 {

	public static void main(String[] args) {
		
		Runnable obj1 = ()-> {
				for (int i = 0; i < 5; i++) {
					System.out.println("Ram :: Hi");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

		}; //obj1
		
		Runnable obj2 = ()-> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Sham :: Hello");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}; //obj2
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
	}; //main

}
