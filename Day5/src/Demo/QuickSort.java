package Demo;

public class QuickSort {

	public static void sort(int[] arr, int left, int right){
		if(right <= left)
			return;
		int flag = arr[left];
		int p = left + 1;
		int q = right;
		while(p <= q){
			if(arr[p] < flag){
				arr[p-1] = arr[p];
				arr[p] = flag;
				p++;
			} else if(arr[p] == flag){
				p++;
			} else {
				int swap = arr[p];
				arr[p] = arr[q];
				arr[q] = swap;
				q--;
			}
		}
		sort(arr, left, q-1);
		sort(arr, p, right);

	}

	
}
