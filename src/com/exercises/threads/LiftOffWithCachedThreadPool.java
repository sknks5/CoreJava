package com.exercises.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

class LiftOff1 implements Runnable{
	
	int countDown = 0;
	static int taskId = 0;
	
	LiftOff1(int countDown){
		this.countDown = countDown;
	}
	
	public void printCountDown(){
		System.out.println("# " + Thread.currentThread().getName() + "#" + this.countDown + "#");
		Thread.yield();
		this.countDown--;
	}

	@Override
	public void run() {
		Thread.currentThread().setName("Thread-" + taskId + Thread.currentThread().getName());
		// TODO Auto-generated method stub
		while (this.countDown > 0)
			printCountDown();
		System.out.println("#LiftOff#");
		
	}
}

public class LiftOffWithCachedThreadPool {
	
	public static void main(String[] args){
		ThreadFactory threadFactory = Executors.defaultThreadFactory();		
		ExecutorService exec = Executors.newSingleThreadExecutor(threadFactory);

		
		for (int i=0;i<5;i++){
			LiftOff1.taskId++;
			
			exec.execute(new LiftOff1(5));
		}
		exec.shutdown();
		
		
		
	}
	
	

}
