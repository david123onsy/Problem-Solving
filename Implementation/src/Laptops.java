import java.io.*;
import java.util.*;

public class Laptops {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n  =sc.nextInt();

		Pair in [] = new Pair[n];
		for(int i = 0 ;i <  n ; i++)in[i]=new Pair(sc.nextInt(),sc.nextInt());
		
		Arrays.sort(in, new Comparator<Pair>() {
			public int compare(Pair o1, Pair o2) {
				return o1.quality > o2.quality ? -1 :(o1.quality < o2.quality ? 1 : 0);
			}
		});
		
		for(int i = 0 ; i <n-1;i++) {
			if(in[i].quality>in[i+1].quality&&in[i].price<in[i+1].price) {
				System.out.println("Happy Alex");
				return;
			}
		}
		System.out.println("Poor Alex");
	}
	static class Pair{
		int price, quality;

		public Pair(int p , int q) {
			price=p;quality=q;
			// TODO Auto-generated constructor stub
		}
	}
}
