package Xiaoqiang;

import java.util.Arrays;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
		Integer[] a = {1,2,3,4,5};
		Arrays.sort(a, (x, y) -> (y - x));
		
		Dog dog1 = new Dog();
		smallDog dog2 = new smallDog();
	}

}

class Dog{
	public int a;
	protected String name;
	String color;
	private float price;
	
	public void ab1(){
		System.out.println(this.a);
		
	}
}

class smallDog extends Dog{
	
}