import java.io.*;
import java.util.*;


public class Towers {
	public static void main(String[]args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []presence =new int[(int) (1e6+1)];
		int []parts=new int[(int) (1e6+1)];

		int max=  0;

		for(int i =0,num;i<n ; i++) {
			num=sc.nextInt();
			max = Math.max(max,num);
			parts[num]=++presence[num];
			
		}
	//	System.out.println(Arrays.toString(presence));
	//	System.out.println(Arrays.toString(parts));
		
		for(int i = 1 ; i<=  (1e6); i++) 
			if(presence[i]>1) {//mowgowd mnha etnen
			//	System.out.println(" i "+i+" with presesn "+presence[i]  + " with parts "+parts[i]);
				presence[presence[i]*i]++;//how many times it occurs 
				// while the parts array contains the number of parts that i consists of;
				parts[presence[i]*i]+=parts[i];
				parts[i]=presence[i]=0;
			//	System.out.println("FINALLY "+parts[presence[i]*i]);
			}

		int highest=0;
		int longest=0;
		for(int i = 1 ; i<=  (1e6); i++) {
			highest =Math.max(parts[i], highest);
			if(parts[i]>0)longest++;
		}
	//	System.out.println(Arrays.toString(parts));
	//	System.out.println(Arrays.toString(presence));
		System.out.println(highest+" "+longest);
	}
	static class Scanner 
	{
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}

		public String next() throws IOException 
		{
			while (st == null || !st.hasMoreTokens()) 
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {return Integer.parseInt(next());}

		public long nextLong() throws IOException {return Long.parseLong(next());}

		public String nextLine() throws IOException {return br.readLine();}

		public double nextDouble() throws IOException
		{
			String x = next();
			StringBuilder sb = new StringBuilder("0");
			double res = 0, f = 1;
			boolean dec = false, neg = false;
			int start = 0;
			if(x.charAt(0) == '-')
			{
				neg = true;
				start++;
			}
			for(int i = start; i < x.length(); i++)
				if(x.charAt(i) == '.')
				{
					res = Long.parseLong(sb.toString());
					sb = new StringBuilder("0");
					dec = true;
				}
				else
				{
					sb.append(x.charAt(i));
					if(dec)
						f *= 10;
				}
			res += Long.parseLong(sb.toString()) / f;
			return res * (neg?-1:1);
		}

		public boolean ready() throws IOException {return br.ready();}


	}

}