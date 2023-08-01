package StringDemo;

import java.util.StringTokenizer;

public class StringTokensDemo {

	public static void main(String[] args) {
		
		StringTokenizer st=new StringTokenizer("My,Name,is,Nabi,Rasool,Shaik",",");

		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}

}
