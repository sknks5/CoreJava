package com.exercises.threads;

public class Liftoff implements Runnable{
	
	public static int countDown = 10;
	public Liftoff(){
		System.out.println("LiftOff Object created");
	}
	public Liftoff(int countDown){
		this.countDown = countDown;
	}
	public String printCountDown(){
		return ("#" + Thread.currentThread().getName() + (countDown > 0 ? countDown : "LiftOff"));
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (countDown-- > 0){
			System.out.println(printCountDown());
			Thread.yield();
		}		
	}
	
	public static void main(String[] args){
		Liftoff liftOff = new Liftoff(20);
		Thread t = new Thread(liftOff);
		t.setName("First Launch");
		t.start();
		Thread t2 = new Thread(liftOff);
		t2.setName("Second Launch");
		t2.start();		
		System.out.println("Countdown for liftoff started");
	}
}
