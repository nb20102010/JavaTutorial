package homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Joseph {

	public static void main(String[] args){
		int n = 5, m = 2, k = 2;
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <= n; i++){
			q.add(i);
		}
		List<Integer> res = new ArrayList<>();
		for(int i = 1; i < k; i++){
			q.add(q.poll());
		}
		while(!q.isEmpty()){
			for(int i = 1; i < m; i++){
				q.add(q.poll());
			}
			res.add(q.poll());
		}
		System.out.println(res);
	}	
}
