package Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buf = new BufferedReader(isr);
		int n = Integer.parseInt(buf.readLine());
		Exercise1 e = new Exercise1();
		e.multiplicationTable(n);
	}
	
	public void multiplicationTable(int n){
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				String output = j + "x" + i + "=" + (i*j);
				while(output.length() < 7)
					output += " ";
				System.out.print(output);
			}
			System.out.println();
		}
	}
}
