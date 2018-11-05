package Demo3_1;

public class Demo1 {

	public Demo1() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){
		Kid k1 = new Kid();
	}
}

class Stu{
	public int age;
	public String name;
	public float fee;
	
	public void printName(){
		System.out.println("Name is " + this.name);
	}
}


//Pupil
class Pupil extends Stu{
	
	//pay fee
	public void pay(float fee){
		this.fee = fee;
	}
}

class Kid extends Pupil{}

// Middle School Student
class MiddileStu extends Stu{
	
	public void pay(float fee){
		this.fee = 0.8f * fee;
	}
}

//College student
class ColStu extends Stu{
	
	public void pay(float fee){
		this.fee = 0.1f * fee;
	}
}






