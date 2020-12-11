package com.simplilearn.multithreading;

public class ThreadDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		Ram t1  = new Ram();
		John t2 = new John();
		Mike t3 = new Mike();
		
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

class Ram extends Thread {
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

class John extends Thread {
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

class Mike extends Thread {
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

