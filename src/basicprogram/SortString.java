package basicprogram;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Abhishekbhat";
		char b[]=a.toCharArray();
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]);
		}
		System.out.println();
		Arrays.sort(b);	
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]);
		}
		
		
	}

}
