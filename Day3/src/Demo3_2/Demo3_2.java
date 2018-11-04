package Demo3_2;

public class Demo3_2 {
	
	static int i = 1;
	
	static{
		i++;
	}
	
	public Demo3_2(){
		i++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch1 = new Child(3, "Niuniu");
		ch1.joinGame();
		Child ch2 = new Child(4, "Xiaoxiao");
		ch2.joinGame();
		Child ch3 = new Child(4, "Dada");
		ch3.joinGame();
		System.out.println("Total = " + Child.total);
	}

}

class Child{
	int age;
	String name;
	static int total = 0;
	
	Child(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public void joinGame(){
		total++;
		System.out.println("a child joined the game");
	}
}
