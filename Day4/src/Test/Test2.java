package Test;

public class Test2 {

	public Test2() {
		// TODO Auto-generated constructor stub
	}

}

class Monkey implements Bird{
	String name;
	
	public void jump(){
		System.out.println("Monkey can jump!");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
}

interface Fish{
	public void swimming();
}
interface Bird{
	public void fly();
}

class LittleMonkey extends Monkey implements Fish{

	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		
	}
	
}