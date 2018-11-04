package Demo3_1;

public class Demo3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog(2, "Da Huang");
		Person p1 = new Person(dog1, 23, "Guo Degang");
		Person p2 = new Person(dog1, 24, "Liu Qian");
		p1.showInfo();
		p1.dog.showInfo();
		p1.dog.name = "Xiao Huang";
		p2.dog.showInfo();
	}

}

class Person{
	int age;
	String name;
	Dog dog;
	public Person(Dog dog, int age, String name){
		this.age = age;
		this.name = name;
		this.dog = dog;
	}
	
	public void showInfo(){
		System.out.println("Name is: " + name);
	}
}

class Dog{
	int age;
	String name;
	public Dog(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public void showInfo(){
		System.out.println("Dog name is " + this.name);
	}
}