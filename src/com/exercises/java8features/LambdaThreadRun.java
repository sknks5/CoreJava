package com.exercises.java8features;

public class LambdaThreadRun {
	
	public static void main(String[] args){
		System.out.println("Before launching a thread");
		int i = 0;
		while (i<10){
		new Thread(()->{
			System.out.println("From launched thread");
			printFromThread();
			try {
				Thread.sleep(50000);
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}).start();
		i++;
		}
		System.out.println("End of main thread");
	}
	
	public static void printFromThread(){
		System.out.println("This message is from printFromThread() launched thread");
	}
}
