package Demo3_2;

public class Demo3_3 {
	
	static int i = 1;
	
	//static code block
	static{
		i++;
		System.out.println(i + " static code block");
	}
	
	//dynamic code block
	{
		i++;
		System.out.println(i + " dynamic code block");
	}

	public Demo3_3() {
		// TODO Auto-generated constructor stub
		i++;
		System.out.println(i + " constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3_3 t1 = new Demo3_3();
		System.out.println(t1.i);
		Demo3_3 t2 = new Demo3_3();
		System.out.println(t2.i);
		Stu stu1 = new Stu(29, "aa", 340);
		Stu stu2 = new Stu(29, "bb", 240);
		System.out.println(Stu.getTotalFee());
		
		Clerk clerk1 = new Clerk("Xiaohua", 24, 4567.6f);
		System.out.println("Name is " + clerk1.name);
		//System.out.println("Her salary is " + clerk1.salary);
	}

}

class Clerk{
	public String name;
	private int age;
	private float salary;
	public Clerk(String name, int age, float salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
}

class Stu{
	int age;
	String name;
	int fee;
	static int totalFee;
	public Stu(int age, String name, int fee){
		this.age = age;
		this.name = name;
		totalFee += fee;
	}
	public static int getTotalFee(){
		return totalFee;
	}
}
