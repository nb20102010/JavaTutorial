package Demo;

public class Insert {

	public static void sort(int[] arr){
		for(int i = 1; i < arr.length; i++){
			int insertVal = arr[i];
			int j = i - 1;
			while(j >= 0 && insertVal < arr[j]){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = insertVal;
		}
	}

}
