import java.io.*;
import java.util.*;

public class Bachgold_Problem {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int totalTwos = 0,totalThrees=0,total;
		if(n%2==0) 
			total=totalTwos=n/2;
		else {
			total=1+(totalTwos=(n/2)-1);
			totalThrees=1;
		}
			StringBuilder sb = new StringBuilder(total+"\n");
		
			while(totalTwos-->0) 
				sb.append(2+" ");

			while(totalThrees-->0) 
				sb.append(3+" ");
			
			System.out.println(sb);

	}
}