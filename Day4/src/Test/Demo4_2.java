package Test;

import com.sun.org.apache.bcel.internal.generic.AALOAD;

public class Demo4_2 {

	public Demo4_2() {
		// TODO Auto-generated constructor stub

	}
	
	public static void main(String[] args){
		Computer c = new Computer();
		Camera ca = new Camera();
		Phone p = new Phone();
		c.useUsb(ca);
		c.useUsb(p);
	}
}

interface Usb{
	public void start();
	public void stop();
}

class Camera implements Usb{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("I am camera. I start");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("I am camera. I end");
	}
	
}

class Phone implements Usb{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("I am phone. I start");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("I am phone. I stop");
	}
	
}

class Computer{
	public void useUsb(Usb usb){
		usb.start();
		usb.stop();
	}
}

interface a{
	public void aaa();
}
interface b{
	public void aaa();
}
interface c extends a,b{
	public void ccc();
}

class abc implements c{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ccc() {
		// TODO Auto-generated method stub
		
	}




	
}
