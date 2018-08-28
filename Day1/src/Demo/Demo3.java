package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo3 {
	
	public static void main(String[] args) throws IOException {
		
//		String string;
//		int a;
//		BufferedReader bufferedReader;
//		InputStreamReader iStreamReader = new InputStreamReader(System.in);
//		bufferedReader = new BufferedReader(iStreamReader);
//		string = bufferedReader.readLine();
//		a = Integer.parseInt(string);

//		float a = (float) 12.3;
//		switch (a) {
//		case 12.3:
//			System.out.println(a);
//			break;
//
//		default:
//			break;
//		}

//		String a = "123";
//		switch (a) {
//		case "123":
//			System.out.println(a);
//			break;
//
//		default:
//			break;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buf = new BufferedReader(isr);
		int n = Integer.parseInt(buf.readLine());
		
		for(int i = 0; i < n; i++){
			for(int j = 0; i + j < n-1; j++){
				System.out.print(" ");
			}
			for(int j = 0; j < i + i + 1; j++){
				if(i == n -1 || j == 0 || j == i + i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
