package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo5_1 {

	public Demo5_1() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws IOException{
		float[] arr = {3, 5, 1, 3.4f, 2, 50};
		float all = 0;
		for(int i = 0; i < 6; i++){
			all += arr[i];
		}
		System.out.println("All = " + all);
		
		Dog[] dogs = new Dog[4];
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		for(int i = 0; i < 4; i++){
			dogs[i] = new Dog();
			System.out.println("Input Dog's name:");
			String name = br.readLine();
			dogs[i].setName(name);
			String s_weight = br.readLine();
			float weight = Float.parseFloat(s_weight);
			dogs[i].setWeight(weight);
		}
		float allWeight = 0;
		for(int i = 0; i < 4; i++){
			allWeight += dogs[i].getWeight();
		}
		float avgWeight = allWeight/dogs.length;
		System.out.println("Total is " + allWeight + " Average is " + avgWeight);
		
		float maxWeight = dogs[0].getWeight();
		int maxIndex = 0;
		
		for(int i = 1; i < dogs.length; i++){
			if(maxWeight < dogs[i].getWeight()){
				maxWeight = dogs[i].getWeight();
			}
		}
		
		System.out.println("maxIndex = " + maxIndex);
		System.out.println("maxWeight = " + maxWeight);
	}	
}


class Dog{
	private String name;
	private float weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
}