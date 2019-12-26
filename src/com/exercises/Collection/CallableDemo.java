package com.exercises.Collection;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class RandomNumberGenerator implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		Thread.sleep (2000);
		int randNum = rand.nextInt(99);
		System.out.println("Returning " + randNum);
		return randNum;
	}
	
}


public class CallableDemo {
	
	public static void main(String[] args) {
		RandomNumberGenerator randNum = new RandomNumberGenerator();
		ExecutorService exec = Executors.newCachedThreadPool();
		Future<Integer> result = exec.submit(randNum);
		int rand = 0;
		try {
			rand = result.get(); //get() blocks
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//randNum.call();
		System.out.println("Done " + rand);
	}

}
