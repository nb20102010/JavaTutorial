package Demo3_3;

public class Demo3 {
	
	public static void main(String[] args){
		Animal animal = new Animal();
		animal.cry();
		animal = new Cat();
		animal.cry();
		animal = new Dog();
		animal.cry();
	}

}

class Animal{
	protected void cry(){
		System.out.println("I dont know how to cry");
	}
}

class Cat extends Animal{
	@Override
	public void cry(){
		System.out.println("Miaomiaomiao");
	}
}

class Dog extends Animal{
	@Override
	public void cry(){
		System.out.println("Wangwangwang");
	}
}