package Demo;

import com.sun.jndi.url.dns.dnsURLContext;
import com.sun.swing.internal.plaf.metal.resources.metal_zh_TW;

public class Demo4 {
	
	public static void main(String[] args){
		Cat cat1 = new Cat();
		Person p1 = new Person();
		p1.speak();
		p1.jiSuan();
		p1.jiSuan(100);
		p1.add(2, 3);
		System.out.println(p1.add3(1, 2.2, 3.4));
		
		Person p2 = new Person("Tom");
		Person p3 = new Person(15, "Jerry");
	}
	
}

class Person{
	int age;
	String name;
	
	public Person(){
		
	}
	
	public Person(String name){
		System.out.println("I am Constructor 1");
		this.name = name;
	}
	
	public Person(int age, String name){
		System.out.println("I am Constructor 2");
		this.age = age;
		this.name = name;
	}
	
	public void speak(){
		System.out.println("I am a kind person");
	}
	
	public void jiSuan(){
		int result = 0;
		for(int i = 0; i <= 1000; i++){
			result += i;
		}
		System.out.println("result= " + result);
	}
	
	public void jiSuan(int n){
		int result = 0;
		for(int i = 0; i < n; i++){
			result += i;
		}
		System.out.println("result= " + result);
	}
	
	public void add(int num1, int num2){
		System.out.println(num1 + num2);
	}
	
	public double add3(int num1, double num2, double num3){
		return num1+num2+num3;
	}
}

class Cat{
	
	int age;
	String name;
	String color;
	
}
