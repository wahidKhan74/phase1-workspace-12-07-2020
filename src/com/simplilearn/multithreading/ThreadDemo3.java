package com.simplilearn.multithreading;

public class ThreadDemo3 {

	public static void main(String[] args) throws InterruptedException {
		
		Bob obj1  = new Bob();
		Marry obj2 = new Marry();
		David obj3 = new David();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		Thread t3 = new Thread(obj3);
		
		t1.start();
		t2.start();
		t3.start();
//		try { Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
		
		t1.join();
		t2.join();
		t3.join();
		System.out.println("End of Main Thread ");
	}

}

class Michael {
	public void show() {
		System.out.println("");
	}
}
class Bob extends Michael implements Runnable {
	// It is used to perform an action for a thread.
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Ram :: Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

class Marry implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("John :: Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class David implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Mike :: Namaste");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

