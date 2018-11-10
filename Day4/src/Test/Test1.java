package Test;


public class Test1 {

	static{
		System.out.println("static block");
	}
	
	{
		System.out.println("dynamic block");
	}
	public Test1() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
	}

}

abstract class Animal{
	
	String name;
	int age;
	
	abstract public void cry();
}

class Cat extends Animal{

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		
	}
	
}