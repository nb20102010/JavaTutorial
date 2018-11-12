package Demo;

import java.util.ArrayList;

public class Demo6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList<>();
		System.out.println(a1.size());
		
		Clerk clerk1 = new Clerk("Song Jiang", 50, 1000);
		Clerk clerk2 = new Clerk("Wu Yong", 45, 1200);
		a1.add(clerk1);
		a1.add(clerk2);
		System.out.println(a1.size());
//		Clerk temp = (Clerk) a1.get(0);
//		System.out.println("The first is " + temp.getName());
		for(int i = 0; i < a1.size(); i++){
			System.out.println("Name = " + ((Clerk)a1.get(i)).getName());
		}
	}

}

class Clerk{
	private String name;
	private int age;
	private int sal;
	public Clerk(String name, int age, int sal) {
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
}