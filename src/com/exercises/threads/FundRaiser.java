package com.exercises.threads;

import java.util.Random;

public class FundRaiser {
	
	public static int totalCollection;
	public static final Object ObjLock = new Object();
	public static int counter;
	
	public static void addCollection(int amount){

		synchronized(ObjLock){		
		totalCollection += amount;
		counter++;
		System.out.println("Amount received = " + amount + " Amount Collection = " + totalCollection);
		}		
	}
}

class TestFundRaiser implements Runnable{
	
	public static void main(String[] args) throws InterruptedException{
		
		
		Thread t1 = new Thread(new TestFundRaiser());
		t1.setName("t1");
		t1.start();
		Thread t2 = new Thread(new TestFundRaiser());
		t1.setName("t2");
		t2.start();
		t2.join();
		

	//Thread.sleep(200);
	
	System.out.println("Total Threads = " + FundRaiser.counter);
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i=0;i<100;i++)
		{
			Random rand = new Random();
			int amount = rand.nextInt(50);
			FundRaiser.addCollection(amount);
			
		}

		
	
	}
	
}
