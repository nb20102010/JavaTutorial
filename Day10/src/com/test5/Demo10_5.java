package com.test5;

public class Demo10_5 {

	public Demo10_5() {
		// TODO Auto-generated constructor stub
	
	}
	
	public static void main(String[] args){
		TicketWindow tw = new TicketWindow();
		Thread t1 = new Thread(tw);
		Thread t2 = new Thread(tw);
		Thread t3 = new Thread(tw);
		
		t1.start();
		t2.start();
		t3.start();
	}

}

class TicketWindow implements Runnable{
	
	int ticket;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized(this) {
				if(ticket > 0){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
					System.out.println(Thread.currentThread().getName() + " are selling the" + (ticket--) + "th ticket");
				}
				else {
					break;
				}
			}
		}
		
	}
	
	public TicketWindow() {
		// TODO Auto-generated constructor stub
		this.ticket = 2000;
	}
}