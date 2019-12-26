package com.exercises.threads;

class BankAccount {
	
	public String name;
	public int number;
	public int balance;
	
	BankAccount(String name, int number, int balance){
		this.name = name;
		this.number = number;
		this.balance = balance;
	}
	
	public void creditAccount(int amount){
		this.balance += amount;
	}
}

class bankApp extends Thread {
	
	BankAccount account;
	
	
	
	
	
	public void run() {
		System.out.println("My own thread");
	}
	
}

public class ExtendsThreadDemo {
	
	public static void main(String[] args){
		myThread t1 = new myThread();
		t1.start();
	}

}
