package Demo;

import java.util.ArrayList;

public class Demo6_2 {
	
	public static void main(String[] args){
		EmpManage em = new EmpManage();
		
	}
	
}

class EmpManage{
	
	private ArrayList al = null;
	
	public EmpManage(){
		al = new ArrayList();
		
	}
	
	public void addEmp(Emp emp){
		al.add(emp);
	}
	
	public void showInfo(String empNo){
		for(int i = 0; i < al.size(); i++){
			Emp emp = (Emp)al.get(i);
			if(emp.getEmpNo().equals(empNo)){
				System.out.println("Found the Employee:");
				System.out.println("empNo = " + emp.getEmpNo());
				System.out.println("name = " + emp.getName());
				System.out.println("salary = " + emp.getSal());
			}
		}
	}
	
	public void updataSal(String empNo, float newSal){

		for(int i = 0; i < al.size(); i++){
			Emp emp = (Emp)al.get(i);
			if(emp.getEmpNo().equals(empNo)){
				emp.setSal(newSal);
			}
		}
	}
	
	public void delEmp(String empNo){
		for(int i = 0; i < al.size(); i++){
			Emp emp = (Emp)al.get(i);
			if(emp.getEmpNo().equals(empNo)){
				al.remove(emp);
			}
		}
	}
}


class Emp{
	private String empNo;	
	private String name;
	private float sal;
	
	public Emp(String empNo, String name, float sal) {
		this.empNo = empNo;
		this.name = name;
		this.sal = sal;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}
	
	
	
}