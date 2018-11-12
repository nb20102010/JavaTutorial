package Demo;

import java.util.Arrays;
import java.util.Calendar;

public class Demo5_3 {

	public Demo5_3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Bubble Sort");
		int[] arr1 = {8,3,2,1,4,6,5,7};
		System.out.println(Arrays.toString(arr1));
		Bubble.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("Select Sort");
		int[] arr2 = {8,3,2,1,4,6,5,7};
		System.out.println(Arrays.toString(arr2));
		Select.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("Insert Sort");
		int[] arr3 = {8,3,2,1,4,6,5,7};
		System.out.println(Arrays.toString(arr3));
		Insert.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		
		System.out.println("Quick Sort");
		int[] arr4 = {8,3,2,1,4,6,5,7};
		System.out.println(Arrays.toString(arr4));
		QuickSort.sort(arr4, 0, arr4.length-1);
		System.out.println(Arrays.toString(arr4));
		
		byte b = -127;
		b = (byte) (b << 1);
		System.out.println(b);
	}

}
