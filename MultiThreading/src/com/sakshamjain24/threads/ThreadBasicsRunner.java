package com.sakshamjain24.threads;

//extends Thread
//implements Runnable

//States of Thread:
//NEW
//RUNNABLE
//RUNNING
//BLOCKED/WAITING
//TERMINATED/DEAD

//Thread.sleep(1000)
//Thread.yeild()
//synchronized

class Task1 extends Thread {
	public void run() { // SIGNATURE
		System.out.println("\n Task1 Started ");
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n Task1 Done "); // TERMINATED/DEAD
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		// Task3
		System.out.println("\n Task2 Started ");
		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n Task2 Done ");
	}

}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {
		// Task1
		Task1 task1 = new Task1(); // NEW
		task1.setPriority(1);
//		task1.run();
		task1.start();

		// Task2
		Task2 task2 = new Task2();
		Thread task2thread = new Thread(task2);
		task2thread.setPriority(10);
		task2thread.start();

		// wait for task1 to complete
		task1.join();
		// wait for task1 to complete
		task2thread.join();

		// Task3
		System.out.println("\n Task3 Started ");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n Task3 Done ");

		System.out.println("\n Main Done");

	}

}
