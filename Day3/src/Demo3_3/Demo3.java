package Demo3_3;

public class Demo3 {
	
	public static void main(String[] args){
		Animal1 animal = new Animal1();
		animal.cry();
		animal = new Cat1();
		animal.cry();
		animal = new Dog1();
		animal.cry();
	}

}

class Animal1{
	protected void cry(){
		System.out.println("I dont know how to cry");
	}
}

class Cat1 extends Animal1{
	@Override
	public void cry(){
		System.out.println("Miaomiaomiao");
	}
}

class Dog1 extends Animal1{
	@Override
	public void cry(){
		System.out.println("Wangwangwang");
	}
}