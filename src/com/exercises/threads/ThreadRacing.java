package com.exercises.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreadRacing {
	
	private static Logger log = LoggerFactory.getLogger(ThreadRacing.class);
	public static void main(String[] args){
		
        
		log.info("Getting started");
		countdown cd = new countdown();
       
		Thread t1 = new Thread (new CountdownThread(cd));
		t1.setName("Thread 1-->");
		t1.start();
		
		Thread t2 = new Thread (new CountdownThread(cd));
		t2.setName("Thread 2-->");
		t2.start();
		
		ExecutorService ex1 = Executors.newFixedThreadPool(3);
		Thread t3 = new Thread(new CountdownThread(cd));
		ex1.execute(t3);	

		
		Thread t4 = new Thread(new CountdownThread(cd));
		ex1.execute(t4);	
		
		Future<String> future = ex1.submit(new CountdownThreadWithReturn(cd));
		try {
			System.out.println("Return for future " + future.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}

class countdown {
	
	private int i;
	
	public  String doCountdown(){
		
		synchronized(this){
			for (i=10;i>0;i--){
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		}
		return "I am done counting down";
	}
}

class CountdownThreadWithReturn  implements Callable<String>{

	private countdown countdown;
	
	public CountdownThreadWithReturn(countdown countdown){
		this.countdown = countdown;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return countdown.doCountdown();
		
	}	
}

class CountdownThread implements Runnable{
	
	
	private countdown countdown;
	
	public CountdownThread(countdown countdown){
		this.countdown = countdown;
	}

	@Override
	public void run() {
       countdown.doCountdown();		
	}

	
}




