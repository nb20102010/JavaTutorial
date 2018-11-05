package Xiaoming;
import Xiaoqiang.Cat;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){
		Cat cat1 = new Cat();
		Dog dog1 = new Dog();
		System.out.println(dog1.getName());
	}
	
}


class Dog extends Xiaoqiang.Cat{
	{
		this.name = "dg";
	}
	
	public String getName(){
		return this.name;
	}
}