package Demo3_3;

public class Demo5 {

	public Demo5() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){
		Master master = new Master();
		master.feed(new Dog(), new Bone());
		master.feed(new Cat(), new Fish());
//		Cat c = (Cat) new Animal();
//		c.cry();
	}
}

class Animal{
	
	String name;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void cry(){
		System.out.println("I dont know how to cry");
	}
	
	public void eat(){
		System.out.println("I dont know what to eat");
	}
}

class Cat extends Animal{
	
	public void cry(){
		System.out.println("Miaomiaomiao");
	}
	
	public void eat(){
		System.out.println("Eat fish");
	}
}

class Dog extends Animal{
	
	public void cry(){
		System.out.println("Wangwangwang");
	}
	
	public void eat(){
		System.out.println("Eat bones");
	}
}

class Food{
	
	String name;
	
	public void showName(){
		
	}
	
}

class Fish extends Food{
	public void showName(){
		System.out.println("Fish");
	}
}

class Bone extends Food{
	
	public void showName(){
		System.out.println("Bone");
	}
}

class Master{
	public void feed(Animal an, Food f){
		an.eat();
		f.showName();
	}
}





