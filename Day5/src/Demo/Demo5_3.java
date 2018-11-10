package Demo;

import java.util.Arrays;
import java.util.Calendar;

public class Demo5_3 {

	public Demo5_3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len = 100;
		int[] arr = new int[len];
		for(int i = 0; i < len; i++){
			arr[i] = (int)(Math.random() * 10000);
		}
		System.out.println(Arrays.toString(arr));
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTimeInMillis());
		Bubble.sort(arr);
		cal = Calendar.getInstance();
		System.out.println(cal.getTimeInMillis());
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = {8,3,2,1,4,6,5,7};
		System.out.println(Arrays.toString(arr2));
		Select.sort(arr2);
		System.out.println(Arrays.toString(arr2));
	}

}
