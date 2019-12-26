package com.exercises.threads;

public class Launch implements Runnable{
	
	public static int countDown = 10;
	public Launch(){
		System.out.println("LiftOff Object created");
	}
	public Launch(int countDown){
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
		Launch launch = new Launch(20);
		Thread t = new Thread(launch);
		t.setName("First Launch");
		t.setDaemon(false);
		t.start();
		Thread t2 = new Thread(launch);
		t2.setName("Second Launch");
		t2.setDaemon(false);
		t2.start();				
		System.out.println("Countdown for liftoff started");
		/*
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
	}
}
