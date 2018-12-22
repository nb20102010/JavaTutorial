package com.test1;

public class Demo10_1 {

	public static void main(String[] args){
		Cat cat = new Cat();
		cat.start();
		
		Thread t = new Thread(new Dog());
		t.start();
	}

}

class Cat extends Thread{
	
	@Override
	public void run() {
		int cnt = 10;
		// TODO Auto-generated method stub
		while(cnt > 0){
			try{
				Thread.sleep(1000);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
			
			System.out.println("Cat: Hello, World!");
			cnt--;
		}
	}
}

class Dog implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int cnt = 10;
		while(cnt > 0){
			try{
				Thread.sleep(1000);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
			
			System.out.println("Dog: Hello, World!");
			cnt--;
		}
	}
	
}