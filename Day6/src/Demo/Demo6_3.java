package Demo;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class Demo6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add(new Dog());
		a1.add(new Cat());
		System.out.println(a1);
		
		Gen<Dog> gen = new Gen<Dog>(new Dog());
	//	gen.showTypeName();
		
		Cat cat = new Cat();
		cat.print(new Gen<>(1.1f));
	}
	
	

}

class Cat{
	public <T> String print(Gen<T> input){
		input.showTypeName();
		return "";
	}
}
class Dog{
	public void dogMethod1(){}
	public int dogMethod2(){return 0;}
}

class Gen<T>{
	private T o;
	public Gen(T o) {
		this.o = o;
	}
	public void showTypeName(){
		System.out.println("Type is " + o.getClass().getName());
		Method[] m = o.getClass().getMethods();
		System.out.println(Arrays.toString(m));
	}
}