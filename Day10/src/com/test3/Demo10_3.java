package com.test3;

public class Demo10_3 {

	public Demo10_3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b = new Bird(10);
		Pig p = new Pig(10);
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(p);
		t1.start();
		t2.start();
	}

}

class Bird implements Runnable{
	
	int n;
	int res;
	int times;
	public Bird (int n){
		this.n = n;
		this.res = 0;
		this.times = 0;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
			
			res += (++times);
			System.out.println("Curr = " + res);
			if(times == n){
				System.out.println("Final = " + res);
				break;
			}
		}
	}	
}


class Pig implements Runnable{
	int n;
	int times;
	
	public Pig(int n) {
		// TODO Auto-generated constructor stub
		this.n = n;
		this.times = 0;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try{
				Thread.sleep(800);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
			
			System.out.println("I am printing " + (++times) + "th Hello World.");
			if(times == n){
				break;
			}
		}
	}
	
	
}