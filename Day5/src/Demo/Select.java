package Demo;

public class Select {

	public static void sort(int[] arr){
		for(int i = 0; i < arr.length-1; i++){
			int minId = i+1;
			for(int j = i + 1; j < arr.length; j++){
				if(arr[j] < arr[minId]){
					minId = j;
				}
			}
			if(arr[minId] < arr[i]){
				int swap = arr[i];
				arr[i] = arr[minId];
				arr[minId] = swap;
			}
		}
	}

}
